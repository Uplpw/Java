package compile_02;

import java.util.ArrayList;
import java.util.HashMap;

public class NFATools {
	
	//获取Condition元素下标
	public static int getIndexCondition(String str, ArrayList<Condition> list) {
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(str.equals(list.get(i).getCharacter())) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	//获取Letter元素下标
	public static int getIndexLetter(String str, ArrayList<Letter> list) {
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(str.equals(list.get(i).getCharacter())) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	//获取$闭包
	public static String getNFAStartCondition(String conditionString, HashMap<Integer, String[]> listState,
						ArrayList<Condition> listC, int length) {
		String tempStr=conditionString;
		//System.out.println(conditionString);
		String tempString=tempStr;
		while(!tempString.equals("")) {
			String[] arrayStr=tempString.split(" ");
			tempString="";       //重置
			for(int i=0;i<arrayStr.length;i++) {
				int tempIndexC=NFATools.getIndexCondition(arrayStr[i], listC);
				if(listState.containsKey(tempIndexC*length+length-1)) {
					for(int j=0;j<listState.get(tempIndexC*length+length-1).length;j++) {
						if(j==listState.get(tempIndexC*length+length-1).length-1) {
							tempString=tempString+listState.get(tempIndexC*length+length-1)[j];
							tempStr=tempStr+" "+listState.get(tempIndexC*length+length-1)[j];
						}else {
							tempString=tempString+listState.get(tempIndexC*length+length-1)[j]+" ";
							tempStr=tempStr+" "+listState.get(tempIndexC*length+length-1)[j];
						}
					}
				}
			}
		}
		return tempStr;
	}
	
	
	public static String getNFATranform(String conditionString, String str, HashMap<Integer, String[]> listState,
			ArrayList<Condition> listC, ArrayList<Letter> listL) {
		String tempStr="";
		String[] arrayStr=conditionString.split(" ");
		int length=listL.size();
		for(int i=0;i<arrayStr.length;i++) {
			int tempIndexC=NFATools.getIndexCondition(arrayStr[i], listC);
			int tempIndexL=NFATools.getIndexLetter(str, listL);
			if(listState.containsKey(tempIndexC*length+tempIndexL)) {
				for(int j=0;j<listState.get(tempIndexC*length+tempIndexL).length;j++) {
					if(j==listState.get(tempIndexC*length+tempIndexL).length-1) {
						if(tempStr.equals("")) {
							tempStr=tempStr+listState.get(tempIndexC*length+tempIndexL)[j];
						}else {
							tempStr=tempStr+" "+listState.get(tempIndexC*length+tempIndexL)[j];
						}
						
					}else {
						if(tempStr.equals("")) {
							tempStr=tempStr+listState.get(tempIndexC*length+tempIndexL)[j];
						}else {
							tempStr=tempStr+" "+listState.get(tempIndexC*length+tempIndexL)[j];
						}
					}
				}
			}
		}
		return tempStr;
	}
	
	public static DFA getNFAtoDFA(ArrayList<String> list, ArrayList<Letter> listL, Tranform arguTranform, 
							ArrayList<Condition> listC, ArrayList<Condition> startCondition, ArrayList<Condition> endCondition) {
		DFA dfa=new DFA();
		
		//设置状态
		String str="";
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				str=str+String.valueOf(i);
			}else {
				str=str+" "+String.valueOf(i);
			}
			
		}
		dfa.setListCondition(str);
		/*
		System.out.println("--------------状态------------------");
		System.out.println(dfa.getListCondition().size());
		for(int i=0;i<dfa.getListCondition().size();i++){
			System.out.println(dfa.getListCondition().get(i).getCharacter());
		}*/
		
		//设置字符
		str="";
		for(int i=0;i<listL.size()-1;i++) {
			if(i==0) {
				str=str+listL.get(i).getCharacter();
			}else {
				str=str+" "+listL.get(i).getCharacter();
			}
		}
		dfa.setlistLetter(str);
		/*
		System.out.println("--------------字符------------------");
		System.out.println(dfa.getListLetter().size());
		for(int i=0;i<dfa.getListLetter().size();i++){
			System.out.println(dfa.getListLetter().get(i).getCharacter());
		}*/
		
		
		//设置状态转换
		Tranform tranform=new Tranform();
		String[] arrayStr=new String[dfa.getListCondition().size()*dfa.getListLetter().size()];
		int count=0;
		for(int i=0;i<dfa.getListCondition().size();i++) {
			for(int j=0;j<dfa.getListLetter().size();j++) {
				String string=NFATools.getNFATranform(list.get(i), dfa.getListLetter().get(j).getCharacter(), 
						arguTranform.getListState(), listC, listL);
				
				string=NFATools.getNFAStartCondition(string, arguTranform.getListState(), listC, listL.size());
				int index=-1;
				for(int k=0;k<list.size();k++) {
					if(list.get(k).equals(string)) {
						index=k;
					}
				}
				arrayStr[count++]=dfa.getListCondition().get(i).getCharacter()+" "+dfa.getListLetter().get(j).getCharacter()+
						" "+String.valueOf(index);
				//System.out.println(arrayStr[i*j+j]);
			}
		}
		
		tranform.setTranform(arrayStr, dfa.getListCondition(), dfa.getListLetter());
		dfa.setTranform(tranform);
		/*
		System.out.println("--------------转换------------------");
		System.out.println("长度："+arrayStr.length);
		dfa.getTranform().showTranform(dfa.getListCondition(), dfa.getListLetter());
		*/
		
		//设置初态
		for(int i=0;i<list.size();i++) {
			boolean flag=true;
			for(int j=0;j<startCondition.size();j++) {
				if(list.get(i).contains(startCondition.get(j).getCharacter())) {
					continue;
				}else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				dfa.setStartCondition(dfa.getListCondition().get(i).getCharacter(), dfa.getListCondition());
				break;
			}
		}
		/*
		System.out.println("--------------初态------------------");
		System.out.println(dfa.getStartCondition().getCharacter());
		*/
		
		
		//设置终态
		for(int i=0;i<list.size();i++) {
			boolean flag=true;
			for(int j=0;j<endCondition.size();j++) {
				if(list.get(i).contains(endCondition.get(j).getCharacter())) {
					continue;
				}else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				dfa.setEndCondition(dfa.getListCondition().get(i).getCharacter(), dfa.getListCondition());
			}
		}
		/*
		System.out.println("--------------终态------------------");
		for(int i=0;i<dfa.getEndCondition().size();i++) {
			if(i==dfa.getEndCondition().size()-1) {
				System.out.println(dfa.getEndCondition().get(i).getCharacter());
			}else {
				System.out.print(dfa.getEndCondition().get(i).getCharacter()+" ");
			}
			
		}*/
		return dfa;
	}
	
	//判断是否有未被标记的
	public static int isFlag(ArrayList<Boolean> list) {
		int flag=-1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==false) {
				flag=i;
				break;
			}
		}
		return flag;
	}
	
	//判断两个字符串是否相等
	public static boolean isEqual(String str1, String str2) {
		String[] tempStr1=str1.split(" ");
		String[] tempStr2=str2.split(" ");
		boolean flag=true;
		
		for(int i=0;i<tempStr1.length;i++) {
			for(int j=0;j<tempStr2.length;j++) {
				if(tempStr1[i].equals(tempStr2[j])) {
					break;
				}else {
					if(j==tempStr2.length-1) {
						flag=false;
						break;
					}
				}
			}
			if(flag==false) {
				break;
			}
		}
	
		if(flag==true) {
			for(int i=0;i<tempStr2.length;i++) {
				for(int j=0;j<tempStr1.length;j++) {
					if(tempStr2[i].equals(tempStr1[j])) {
						break;
					}else {
						if(j==tempStr1.length-1) {
							flag=false;
							break;
						}
					}
				}
				if(flag==false) {
					break;
				}
			}
		}
		return flag;
	}
	
	//判断字符串是否在list中
	public static boolean isRemain(String str, ArrayList<String> list) {
		boolean flag=false;
		for(int i=0;i<list.size();i++) {
			if(str.equals(list.get(i))) {
				flag=true;
				break;
			}else {
				continue;
			}
		}
		return flag;
	}
}
