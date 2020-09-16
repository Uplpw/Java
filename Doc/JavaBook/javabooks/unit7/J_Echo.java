//简介: 屏幕输入回显例程


import java.io.InputStream;//抽象类
import java.io.IOException;
public class J_Echo {
	public static void mb_echo(InputStream in){
		try{
			while(true){
				int i=in.read();//读取一个字节，到达输入流末尾返回-1，输入流末尾指换行
				if(i==-1)
					break;
				char c=(char)i;
				System.out.print(c);
			}
		}
		catch(IOException e){
			System.out.println("发生异常:"+e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		mb_echo(System.in);//System.in标准输入，类java.io.InputStream的变量
	}
}
