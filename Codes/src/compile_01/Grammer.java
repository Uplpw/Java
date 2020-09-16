package compile_01;

import java.util.ArrayList;

/*
 * 文法类：Grammer
 * 设置非终结符、终结符、产生式的属性list
 * 设置开始符的对象属性：signalVn
 * 设置方法processFile（）：解析文件的内容并将其根据格式存入属性中
 * 设置方法getGrammer()：将类属性的值输出
 */
class Grammer {
	//非终结符
	private ArrayList<SignalVn> listVn;
	
	//终结符
	private ArrayList<SignalVt> listVt;
	
	//开始符
	private SignalVn signalVn;
	
	//产生式
	private ArrayList<ProduceP> listP;
	
	public Grammer() {
		this.listVn=new ArrayList<SignalVn>();
		this.listVt=new ArrayList<SignalVt>();
		this.signalVn=new SignalVn();
		this.listP=new ArrayList<ProduceP>();
	}
	
	public void setGrammer(String strVn, String strVt, ArrayList<String> strP, String strS) {
		
		String[] tempStrVn=strVn.split(" ");
		for(int i=0;i<tempStrVn.length;i++) {
			SignalVn signalVn=new SignalVn();
			signalVn.setSignal(tempStrVn[i]);
			this.listVn.add(signalVn);
		}
		
		String[] tempStrVt=strVt.split(" ");
		for(int i=0;i<tempStrVt.length;i++) {
			SignalVt signalVt=new SignalVt();
			signalVt.setSignal(tempStrVt[i]);
			this.listVt.add(signalVt);
		}
		
		for(int i=0;i<strP.size();i++) {
			String[] tempStr=strP.get(i).split(" ");
			ProduceP produceP=new ProduceP();
			produceP.setProduce(tempStr);
			this.listP.add(produceP);
		}
		
		this.signalVn.setSignal(strS);
		
	}
	
	//在读取文件的内容时一定要注意文件不能有多余的空格和换行，否则就会产生莫名其妙的错误
	
	
	public void getGrammer() {
		System.out.println("文法 G=(Vn, Vt, P, S), 其中：");
		
		//输出非终结符
		System.out.print("Vn={");
		for(int i=0;i<this.listVn.size();i++) {
			if(i==this.listVn.size()-1) {
				System.out.println(this.listVn.get(i).getSignal()+"}");
			}else {
				System.out.print(this.listVn.get(i).getSignal()+", ");
			}
		}
		
		//输出终结符
		System.out.print("Vt={, ");
		for(int i=0;i<this.listVt.size();i++) {
			if(i==this.listVt.size()-1) {
				System.out.println(this.listVt.get(i).getSignal()+"}");
			}else {
				System.out.print(this.listVt.get(i).getSignal()+", ");
			}
		}
		
		//输出产生式集
		System.out.print("P={");
		for(int i=0;i<this.listP.size();i++) {
			if(i==this.listP.size()-1) {
				System.out.println(this.listP.get(i).getProduce()+"}");
			}else {
				System.out.print(this.listP.get(i).getProduce()+", ");
			}
		}
		
		//输出开始符
		System.out.println("S="+this.signalVn.getSignal());
	}
}
