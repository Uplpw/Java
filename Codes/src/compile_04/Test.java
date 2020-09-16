package compile_04;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		FileProcess fileProcess=new FileProcess();
		fileProcess.fileProcess("C:\\Users\\lpw\\Desktop\\1.txt");
		
		Grammer grammer=new Grammer();
		grammer.setGrammer(fileProcess.getStringVn(), fileProcess.getStringVt(), 
								fileProcess.getStringP(), fileProcess.getStringS());
		grammer.getGrammer();
		
		//first
		System.out.println("----------------");
		System.out.println("First:");
		
		for(int j=0;j<grammer.getListSignalVn().size();j++) {
			First ffs=new First();
			ffs.FIRST(grammer.getListSignalVn().get(j).getSignal(), grammer);
			
			System.out.println(grammer.getListSignalVn().get(j).getSignal()+": ");
			for(int i=0;i<ffs.getFirst().size();i++) {
				System.out.print(ffs.getFirst().get(i).getSignal()+" ");
			}
			System.out.println();
		}
		
		//follow
		System.out.println("----------------");
		System.out.println("Follow:");
		Follow follow=new Follow();
		follow.FOLLOW(grammer);
		HashMap<String, ArrayList<SignalVt>> list=follow.getHashMap();
		for(int j=0;j<list.size();j++) {
			System.out.println(grammer.getListSignalVn().get(j).getSignal()+": ");
			
			for(int i=0;i<list.get(grammer.getListSignalVn().get(j).getSignal()).size();i++) {
				
				System.out.print(list.get(grammer.getListSignalVn().get(j).getSignal()).get(i).getSignal()+" ");
			}
			System.out.println();
		}
		
		/*
		//select
		System.out.println("----------------");
		System.out.println("Select: \n产生式T->SB");
		Select select=new Select();
		select.SELECT(grammer, follow);
		for(int i=0;i<select.getProduceList("TSB").size();i++) {
			System.out.print(select.getProduceList("TSB").get(i).getSignal()+" ");
		}
		*/
		
		System.out.println("\n\n------预测表------");
		LL1 ll=new LL1();
		HashMap<Integer, String> map=ll.setTable(grammer);
		
		for(int i=0;i<grammer.getListSignalVt().size()+1;i++) {
			if(i==grammer.getListSignalVt().size()) {
				System.out.print("\t"+"#");
			}else {
				System.out.print("\t"+grammer.getListSignalVt().get(i).getSignal());
			}
		}
		System.out.println();
		for(int i=0;i<grammer.getListSignalVn().size();i++) {
			System.out.print(grammer.getListSignalVn().get(i).getSignal()+"\t");
			for(int j=0;j<grammer.getListSignalVt().size()+1;j++) {
				if(map.get(i*(grammer.getListSignalVt().size()+1)+j).equals(" ")==false) {
					System.out.print(map.get(i*(grammer.getListSignalVt().size()+1)+j)+"\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		//总控程序测试
		System.out.println("\n------判断字符串 \"(a,a)#\" 结果------\n\n");
		System.out.println("匹配结果："+ll.controlProgram(grammer, "(a,a)#", map));
	}
}
