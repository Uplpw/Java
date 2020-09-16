//简介：读取文件"test.txt"内容的例程


import java.io.FileInputStream; //输入流的子类，
import java.io.IOException;
public class J_EchoFile {
	public static void main(String[] args){
		try{
			FileInputStream f=new FileInputStream("test.txt"); //创建子类对象，并打开文件
			int i=0;
			int b=f.read();          //读取文件中的字节
			for(i=0;b!=-1;i++){
				System.out.print((char)b);
				b=f.read();
			}
			System.out.println();
			System.out.println("文件\"test.txt\"字节数为"+i);
			f.close();
		}
		catch(IOException e){
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		}
	}
}
