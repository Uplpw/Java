//简介：类java.io.PrintStream的文件写入方法的调用例程


import java.io.FileNotFoundException;//文件的例外抛出
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;
public class J_FileWrite {
	public static void main(String[] args) throws FileNotFoundException{
		PrintStream f=new PrintStream("write.txt");
		
		f.append('*');
		f.println();
		
		f.print(false);
		f.println(true);//布尔类型数据的写入
		
		f.print('a');
		f.println('a');
		
		char[] kpl={'k','p','l'};
		f.print(kpl);
		f.println(kpl);
		
		f.print(888);
		f.println(888);//全部写入，
		
		f.print(8.8888);
		f.println(8.8888);//全部写入
		
		String lpl="lpl*lpl";
		f.print(lpl);
		f.println(lpl);
		
		f.printf("%1$d+%2$d=%3$d",1,2,(1+2));
		f.printf("%1$B",true);
		f.printf("%1$c+%2$C",'a','a');
		f.printf("%1$d+%2$o+%3$x+%4$X",888,888,888,888);
		f.printf("%1$e+%2$E",111.1111,2.00000111);
		//格式化写入文件
		
		f.flush(); //强制输出
		f.close();//关闭输出流
	}
}
