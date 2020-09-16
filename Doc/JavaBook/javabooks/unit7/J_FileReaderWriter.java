//简介：文件读写器例程


import java.io.IOException;
import java.io.FileReader;//按字符读取和写入
import java.io.FileWriter;
public class J_FileReaderWriter {
	public static void main(String args[]){
		try{
			FileWriter f_out=new FileWriter("Test1.txt");//创建读写器实例对象
			f_out.write("有志者事竟成888***sudida静安寺");//写入字符串
			f_out.close();
			
			FileReader f_in=new FileReader("Test1.txt");//打开已有文件
			for(int c=f_in.read();c!=-1;c=f_in.read())//循环输出文件中的字符
				System.out.println((char)c);
			f_in.close();
		}
		catch(IOException e){
			System.err.println("发生异常："+e);
			e.printStackTrace();
		}
	}
}
