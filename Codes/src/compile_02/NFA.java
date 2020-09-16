package compile_02;

import java.util.ArrayList;

/*
 * 有穷自动机DFA类
 */
public class NFA {
	//若是NFA,开始状态可以为空以及多个，需修改
	private ArrayList<Condition> listCondition;       //状态集listCondition
	private ArrayList<Letter> listLetter;             //字符集listLetter
	private Tranform tranform;                        //状态转换对象tranform
	private ArrayList<Condition> startCondition;
	private ArrayList<Condition> endCondition;        //终态集endCondition
	private boolean endIsNull;                        //终态是否为空endIsNull
	
	//构造方法初始化
	public NFA() {
		this.listCondition=new ArrayList<Condition>();
		this.listLetter=new ArrayList<Letter>();
		this.tranform=new Tranform();
		this.startCondition=new ArrayList<Condition>();
		this.endCondition=new ArrayList<Condition>();
		this.endIsNull=false;
	}
	
	/*
	 * 方法setListCondition(),设置状态集listCondition
	 * 参数：状态集字符串str
	 */
	public void setListCondition(String str) {
		String[] string=str.split(" ");
		for(int i=0;i<string.length;i++) {
			Condition tempCon=new Condition();
			tempCon.setCharacter(string[i]);
			this.listCondition.add(tempCon);
		}
	}
	
	//getListCondition(),获取状态集listCondition
	public ArrayList<Condition> getListCondition(){
		return this.listCondition;
	}
	
	/*
	 * 方法setListLetter(),设置状态集listLetter
	 * 参数：状态集字符串str
	 */
	public void setlistLetter(String str) {
		String[] string=str.split(" ");
		for(int i=0;i<string.length;i++) {
			Letter tempLetter=new Letter();
			tempLetter.setCharacter(string[i]);
			this.listLetter.add(tempLetter);
		}
	}
	
	//getListCondition(),获取状态集listCondition
	public ArrayList<Letter> getListLetter(){
		return this.listLetter;
	}
	
	/*
	 * 方法setTranform(),设置状态转换tranform
	 * 参数：状态转换对象tranform
	 */
	public void setTranform(Tranform tranform) {
		this.tranform=tranform;
	}
	
	//getTranform(),获取状态转换对象tranform
	public Tranform getTranform() {
		return this.tranform;
	}
	
	/*
	 * 方法setStartCondition(),设置初态startCondition
	 * 参数：初态字符串str, 状态集listCondition
	 */
	public void setStartCondition(String str, ArrayList<Condition> listCondition) {
		String[] string=str.split(" ");
		for(int i=0;i<string.length;i++) {
			for(int j=0;j<listCondition.size();j++) {
				if(string[i].equals(listCondition.get(j).getCharacter())) {
					//若是初态设置该状态的属性startCondition为true
					this.listCondition.get(i).setStartCondition();  
					this.startCondition.add(this.listCondition.get(i));
					break;
				}
			}
		}
	}
	
	//getStartCondition()方法,获取初态
	public ArrayList<Condition> getStartListCondition() {
		return this.startCondition;
	}
	
	/*
	 * 方法setEndCondition(),设置终态listCondition
	 * 参数：终态字符串str, 状态集listCondition
	 */
	public void setEndCondition(String str, ArrayList<Condition> listCondition){
		String[] string=str.split(" ");
		for(int i=0;i<string.length;i++) {
			for(int j=0;j<listCondition.size();j++) {
				if(string[i].equals(listCondition.get(j).getCharacter())) {
					this.listCondition.get(j).setEndCondition();
					this.endCondition.add(this.listCondition.get(j));
					break;
				}
			}
		}
	}
	
	//getEndCondition()方法获取终态
	public ArrayList<Condition> getEndCondition(){
		return this.endCondition;
	}
	
	//setEndIsNull()方法设置终态为空
	public void setEndIsNull() {
		this.endIsNull=true;
	}
	
	//getEndIsNull()方法判断终态是否为空
	public boolean getEndIsNull() {
		return this.endIsNull;
	}
	
	public DFA NFAtoDFA() {
		
		String startString="";
		
		//获得初态String
		for(int i=0;i<this.getStartListCondition().size();i++) {
			if(i==this.getStartListCondition().size()-1) {
				startString=startString+this.getStartListCondition().get(i).getCharacter();
			}else {
				startString=startString+this.getStartListCondition().get(i).getCharacter()+" ";
			}
		}
		//存放确定化后的集合与标记
		ArrayList<String> listStartCondition=new ArrayList<String>();
		ArrayList<Boolean> listFlag=new ArrayList<Boolean>();
		
		//首先获得初态关于$的闭包
		String tempStr=NFATools.getNFAStartCondition(startString, this.getTranform().getListState(), 
				this.getListCondition(), this.getListLetter().size());
		listStartCondition.add(tempStr);
		listFlag.add(false);
	
		//算法,建表
		while(NFATools.isFlag(listFlag)!=-1) {
			int indexList=NFATools.isFlag(listFlag);     //未被标记的下标
			listFlag.set(NFATools.isFlag(listFlag), true);      //将其标记
			for(int i=0;i<this.getListLetter().size()-1;i++) {
				String tempString=NFATools.getNFATranform(listStartCondition.get(indexList), this.getListLetter().get(i).getCharacter(), 
						this.getTranform().getListState(), this.getListCondition(), this.getListLetter());
				
				//System.out.println(listStartCondition.get(indexList)+"---"+this.getListLetter().get(i).getCharacter()+"---"+
				//		tempString);
				tempString=NFATools.getNFAStartCondition(tempString, this.getTranform().getListState(), 
						this.getListCondition(), this.getListLetter().size());
				
				if(NFATools.isRemain(tempString, listStartCondition)==false) {
					listStartCondition.add(tempString);
					listFlag.add(false);
				}
			}
		}
		
		DFA dfa=new DFA();
		dfa=NFATools.getNFAtoDFA(listStartCondition, this.getListLetter(), this.getTranform(), this.getListCondition(), 
				this.getStartListCondition(), this.getEndCondition());
		
		return dfa;
	}
	
	//showNFA()方法显示有穷自动机
	public void showNFA() {
		System.out.println("非确定有限自动机 NFA M={Q, ∑, f, S, Z}, 其中:");
		System.out.print("Q={");
		for(int i=0;i<this.listCondition.size();i++) {
			if(i==this.listCondition.size()-1) {
				System.out.println(this.listCondition.get(i).getCharacter()+"}");
			}else {
				System.out.print(this.listCondition.get(i).getCharacter()+", ");
			}	
		}
		
		//输出字符集
		System.out.print("∑={");
		for(int i=0;i<this.listLetter.size();i++) {
			if(i==this.listLetter.size()-1) {
				System.out.println(this.listLetter.get(i).getCharacter()+"}");
			}else {
				System.out.print(this.listLetter.get(i).getCharacter()+", ");
			}	
		}
		
		//输出状态转换
		System.out.println("f: ");
		this.tranform.showTranform(this.listCondition, this.listLetter);
		
		//输出初态
		System.out.print("S={");
		for(int i=0;i<this.startCondition.size();i++) {
			if(i==this.startCondition.size()-1) {
				System.out.println(this.startCondition.get(i).getCharacter()+"}");
			}else {
				System.out.print(this.startCondition.get(i).getCharacter()+", ");
			}
		}
		
		//输出终态
		if(this.endIsNull==true) {
			System.out.println("Z={}");
		}else {
			System.out.print("Z={");
			for(int i=0;i<this.endCondition.size();i++) {
				if(i==this.endCondition.size()-1) {
					System.out.println(this.endCondition.get(i).getCharacter()+"}");
				}else {
					System.out.print(this.endCondition.get(i).getCharacter()+", ");
				}	
			}
		}
	}
}
