//简介：PrintWriter例程


import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class J_PrintWriter {
	public static void main(String[] args){
		try{
			PrintWriter f=new PrintWriter("ff_out.txt");
			//PrintWriter的构造方法
			/* public PrintWriter(Writer out);
			  public PrintWriter(Writer out, boolean autoFlush);
			                       true强制输出,默认false
			  public PrintWriter(OutputStream out);
			  public PrintWriter(OutputStream out, boolean autoFlush);
			*/
			
			f.println("莫等闲,白了少年头,空悲切");
			char a='*';
			char[] aa={'k','p','l'};
			String aaa="kplkpl";
			
			f.append(a);
			f.write(aa);
			f.write(aaa);
			f.write(888);
			
			//public void print(),  public void println()应用
			
			f.print(true);
			f.println(false);//
			
			f.print(a);
			f.println(a);
			
			f.print(8888);
			f.println(1000000000000000L);
			
			f.print(Math.PI);
			f.println(Math.PI*Math.PI);
			
			f.print(aaa);
			f.println(aaa);
			
			f.close();
		}
		catch(FileNotFoundException e){
			System.err.println("发生异常"+e);
			e.printStackTrace();
		}
	}
}
