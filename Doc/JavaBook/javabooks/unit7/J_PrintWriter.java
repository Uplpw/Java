//��飺PrintWriter����


import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class J_PrintWriter {
	public static void main(String[] args){
		try{
			PrintWriter f=new PrintWriter("ff_out.txt");
			//PrintWriter�Ĺ��췽��
			/* public PrintWriter(Writer out);
			  public PrintWriter(Writer out, boolean autoFlush);
			                       trueǿ�����,Ĭ��false
			  public PrintWriter(OutputStream out);
			  public PrintWriter(OutputStream out, boolean autoFlush);
			*/
			
			f.println("Ī����,��������ͷ,�ձ���");
			char a='*';
			char[] aa={'k','p','l'};
			String aaa="kplkpl";
			
			f.append(a);
			f.write(aa);
			f.write(aaa);
			f.write(888);
			
			//public void print(),  public void println()Ӧ��
			
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
			System.err.println("�����쳣"+e);
			e.printStackTrace();
		}
	}
}
