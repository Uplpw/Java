//简介：重定向例程,将标准输入输出流与指定的建立对应关系


import java.io.FileInputStream;
public class J_SetIn {
	public static void main(String[] args){
		try{
			System.setIn(new FileInputStream("write.txt"));
			J_Echo.mb_echo(System.in);//成员方法,输出文件的内容
		}
		catch(Exception e){
			System.err.println("发生异常："+e);
			e.printStackTrace();
		}
	}
}
