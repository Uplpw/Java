package compile_02;

public class Main {
	public static void main(String[] args) {
		//创建FileProcess对象并解析文件
		FileProcess fileProcess=new FileProcess();
		fileProcess.File("D:\\大三下-电子版作业\\编译原理实验\\编译原理——02\\编译原理——2班\\20162430111_李鹏威\\测试数据\\DFA_03.txt");
		
		//创建DFA对象并设置其属性
		DFA dfa=new DFA();
		dfa.setListCondition(fileProcess.getCondition());
		dfa.setlistLetter(fileProcess.getLetter());
		
		//创建Tranform对象并设置其属性
		Tranform tranform=new Tranform();
		tranform.setTranform(fileProcess.getTranform(), dfa.getListCondition(), dfa.getListLetter());
		dfa.setTranform(tranform);
		
		dfa.setStartCondition(fileProcess.getStartCondition(), dfa.getListCondition());
		//判断终态是否为空
		if(fileProcess.getEndIsNull()==true) {
			dfa.setEndIsNull();
		}else {
			dfa.setEndCondition(fileProcess.getEndCondition(), dfa.getListCondition());
		}
		
		//输出DFA
		dfa.showDFA();

		/*//检查开始符号以及结束符号的正确性
		for(int i=0; i<dfa.getListCondition().size();i++) {
			if(dfa.getListCondition().get(i).isStartCondition()) {
				System.out.println("开始符号："+dfa.getListCondition().get(i).getCharacter());
			}
			if(dfa.getListCondition().get(i).isEndCondition()) {
				System.out.println("结束符号："+dfa.getListCondition().get(i).getCharacter());
			}
		}
		*/
		//创建FileProcess对象并解析文件
		FileProcess fileProcess1=new FileProcess();
		fileProcess1.File("D:\\大三下-电子版作业\\编译原理实验\\编译原理——02\\编译原理——2班\\20162430111_李鹏威\\测试数据\\NFAtoDFA.txt");
				
		//创建NFA对象并设置其属性
		NFA nfa=new NFA();
		nfa.setListCondition(fileProcess1.getCondition());
		nfa.setlistLetter(fileProcess1.getLetter());
				
		//创建Tranform对象并设置其属性
		Tranform tranform1=new Tranform();
		tranform1.setTranform(fileProcess1.getTranform(), nfa.getListCondition(), nfa.getListLetter());
		nfa.setTranform(tranform1);
				
		nfa.setStartCondition(fileProcess1.getStartCondition(), nfa.getListCondition());
		//判断终态是否为空
		if(fileProcess1.getEndIsNull()==true) {
			nfa.setEndIsNull();
		}else {
			nfa.setEndCondition(fileProcess1.getEndCondition(), nfa.getListCondition());
		}
		
		System.out.println("-----------------------------------");
		//输出NFA
		nfa.showNFA();
		
		
		System.out.println("--------------NFAtoDFA----------------");
		//输出DFA
		DFA dfa1=new DFA();
		dfa1=nfa.NFAtoDFA();
		dfa1.showDFA();
		
	}
}
