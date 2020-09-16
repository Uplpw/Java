package compile_02;

import java.util.ArrayList;

public class DFA extends NFA{
	private ArrayList<Condition> listCondition;       //状态集listCondition
	private ArrayList<Letter> listLetter;             //字符集listLetter
	private Tranform tranform;                        //状态转换对象tranform
	private Condition startCondition;
	private ArrayList<Condition> endCondition;        //终态集endCondition
	private boolean endIsNull;                        //终态是否为空endIsNull
	
	public DFA() {
		this.listCondition=new ArrayList<Condition>();
		this.listLetter=new ArrayList<Letter>();
		this.tranform=new Tranform();
		this.startCondition=new Condition();
		this.endCondition=new ArrayList<Condition>();
		this.endIsNull=false;
	}
	
	public void setStartCondition(String str, ArrayList<Condition> listCondition) {
		//System.out.println(str);
		for(int j=0;j<this.getListCondition().size();j++) {
			if(str.equals(this.getListCondition().get(j).getCharacter())) {
				this.getListCondition().get(j).setStartCondition();
				this.startCondition=this.getListCondition().get(j);
				break;
			}
		}
	}
	
	public Condition getStartCondition() {
		return this.startCondition;
	}
	
	
	public void showDFA() {
		System.out.println("确定有限自动机 DFA M={Q, ∑, f, S, Z}, 其中:");
		//System.out.println(this.listCondition.size());
		System.out.print("Q={");
		for(int i=0;i<this.getListCondition().size();i++) {
			if(i==this.getListCondition().size()-1) {
				System.out.println(this.getListCondition().get(i).getCharacter()+"}");
			}else {
				System.out.print(this.getListCondition().get(i).getCharacter()+", ");
			}	
		}
		
		//输出字符集
		System.out.print("∑={");
		for(int i=0;i<this.getListLetter().size();i++) {
			if(i==this.getListLetter().size()-1) {
				System.out.println(this.getListLetter().get(i).getCharacter()+"}");
			}else {
				System.out.print(this.getListLetter().get(i).getCharacter()+", ");
			}	
		}
		
		//输出状态转换
		System.out.println("f: ");
		this.getTranform().showTranform(this.getListCondition(), this.getListLetter());
		
		//输出初态
		//System.out.println("123");
		System.out.println("S={"+this.getStartCondition().getCharacter()+"}");
		
		//输出终态
		if(this.getEndIsNull()==true) {
			System.out.println("Z={}");
		}else {
			System.out.print("Z={");
			for(int i=0;i<this.getEndCondition().size();i++) {
				if(i==this.getEndCondition().size()-1) {
					System.out.println(this.getEndCondition().get(i).getCharacter()+"}");
				}else {
					System.out.print(this.getEndCondition().get(i).getCharacter()+", ");
				}	
			}
		}
	}
}
