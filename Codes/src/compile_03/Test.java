package compile_03;

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
		
		//select
		/*System.out.println("----------------");
		System.out.println("Select: \n产生式S->AB");
		Select select=new Select();
		select.SELECT(grammer, follow);
		for(int i=0;i<select.getProduceList("SAB").size();i++) {
			System.out.print(select.getProduceList("SAB").get(i).getSignal()+" ");
		}*/

	}
}
