package compile_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class LL1 {
	public HashMap<Integer, String> setTable(Grammer grammer) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		//获取预测表的行Vt和列Vn
		ArrayList<SignalVn> listVn=grammer.getListSignalVn();
		ArrayList<SignalVt> listVt=grammer.getListSignalVt();
		
		//hashmap初始化
		for(int i=0;i<listVn.size();i++) {
			for(int j=0;j<listVt.size()+1;j++) {
				map.put(i*(listVt.size()+1)+j," ");
			}
		}
		
		//获取产生式集合listP
		ArrayList<ProduceP> listP=grammer.getListProduceP();
		
		/*
		 * 构造预测表
		 * 1、构造文法 G 的每一个非终结符的FIRST集和FOLLOW集
		 * 2、构造分析表 M[A，a]
		 * (1)对文法 G 的每个规则 A→α，执行第(2)步和第(3)步；
		 * (2)对每个终极符 a∈FIRST(α), 则置 M[A,a]=A→α；
		 * (3)若ε∈FIRST(α）,对每个 b∈FOLLOW(A), 则置 M[A, b]＝A→α；
		 * (4)把所有无定义的 M[A,a] 标上“出错标志”(表中用空格表示)。
		 */
		
		//循环产生式左部
		for(int i=0;i<listP.size();i++) {
			ProduceP produce=listP.get(i);
			int vnIndex=Tools.isContainVn(listVn, produce.getLeftProduce().getSignal());//获取Vn的下标
			
			//循环产生式右部
			ArrayList<String[]> rightProduce=produce.getRightProduce();
			for(int j=0;j<rightProduce.size();j++) {
				
				String rightString=Tools.ArrayToString(rightProduce.get(j));      //合并产生式右部

				//对右部求First集
				First tempFirst=new First();
				tempFirst.FIRST(rightString, grammer);

				//循环终结符
				for(int k=0;k<listVt.size();k++) {				
					if(Tools.isContainVt(tempFirst.getFirst(), listVt.get(k).getSignal())!=-1) {
						map.put(vnIndex*(listVt.size()+1)+k, produce.getLeftProduce().getSignal()+"->"+rightString);
					}	
				}
				
				if(Tools.isContainVt(tempFirst.getFirst(), "&")!=-1) {
					//若含有空求Follow集
					Follow tempFollow=new Follow();
					tempFollow.FOLLOW(grammer);
					ArrayList<SignalVt> tempVt=tempFollow.getVnFollow(produce.getLeftProduce().getSignal());
					if(Tools.isContainVt(tempVt, "#")!=-1) {
						map.put(vnIndex*(listVt.size()+1)+listVt.size(), produce.getLeftProduce().getSignal()+"->"+rightString);
					}
					for(int m=0;m<listVt.size();m++) {
						if(Tools.isContainVt(tempVt, listVt.get(m).getSignal())!=-1) {
							map.put(vnIndex*(listVt.size()+1)+m, produce.getLeftProduce().getSignal()+"->"+rightString);
						}
					}
				}
			}
		}
		return map;
	}
	
	public boolean controlProgram(Grammer grammer, String inputString, HashMap<Integer, String> map) {
		boolean flag=true, returnFlag=true;                                  //循环是否结束符号
		Stack<String> stack=new Stack<String>();            //建立栈
		String intputChar;
		int count=0, step=1;
		//初始化,将#和开始符压入栈中
		stack.push("#");
		stack.push(grammer.getSignalVn().getSignal());
		
		//输入串的处理
		char[] tempArray=inputString.toCharArray();
		intputChar=""+tempArray[count];
		
		System.out.println("步骤"+"\t\t"+"栈元素"+"\t\t"+"输入串"+"\t\t"+"所用规则");
		System.out.println("0"+"\t\t"+Tools.stackToString(stack)+"\t\t"+
				Tools.toStringByIndex(tempArray, count)+"\t\t"+"");
		
		while(flag) {
			/*
			 * 判断当前输入字母是否为结束符，并返回其下表位置
			 */
			int index=-1;
			if(intputChar.equals("#")) {
				index=grammer.getListSignalVt().size();
			}else {
				index=Tools.isContainVt(grammer.getListSignalVt(), intputChar);
			}
			
			if(!stack.isEmpty()) {
				//将栈顶元素压出来
				String tempString=stack.pop();
				//开始判断
				if(Tools.isContainVt(grammer.getListSignalVt(), tempString)!=-1) {
					//判断是终结符
					if(tempString.equals(intputChar)) {
						String tempVt=intputChar;
						count++;
						intputChar=""+tempArray[count];
						System.out.println((step++)+"\t\t"+Tools.stackToString(stack)+"\t\t"+
								Tools.toStringByIndex(tempArray, count)+"\t\t"+"匹配 "+tempVt+" 成功，出栈");
					}else {
						System.out.println((step++)+"语法错误！");
						returnFlag=false;
					}
				}else if(tempString.equals("#")){
					//判断是结束符
					if(tempString.equals(intputChar)) {
						System.out.println((step++)+"\t\t"+"结束符匹配成功，结束。");
						flag=false;
					}else {
						System.out.println((step++)+"语法错误");
						returnFlag=false;
					}
				}else if(!map.get(Tools.isContainVn(grammer.getListSignalVn(), tempString)*
						(grammer.getListSignalVt().size()+1)+index).equals(" ")) {
					String rightString=map.get(Tools.isContainVn(grammer.getListSignalVn(), tempString)*
							(grammer.getListSignalVt().size()+1)+index);
					//判断是非终结符
					if(rightString.substring(3, rightString.length()).equals("&")) {
						System.out.println((step++)+"\t\t"+Tools.stackToString(stack)+"\t\t"+
								Tools.toStringByIndex(tempArray, count)+"\t\t"+rightString);
						//推出空，什么也不加
					}else {
						//String leftString=tempString;
						char[] stackArray=rightString.substring(3, rightString.length()).toCharArray();
	
						for(int i=stackArray.length-1;i>=0;i--) {
							stack.push(""+stackArray[i]);
						}
						System.out.println((step++)+"\t\t"+Tools.stackToString(stack)+"\t\t"+
								Tools.toStringByIndex(tempArray, count)+"\t\t"+rightString);
					}
				}else {
					//不是终结符、非终结符以及#
					System.out.println((step++)+"语法错误");
					returnFlag=false;
				}
			}else {
				System.out.println("栈空");
			}
		}
		return returnFlag;
	}
}
