//简介：输出流例程


import java.io.IOException;
import java.io.OutputStream; //标准输出流类
public class J_Write {
	public static void mb_write(OutputStream out){
		//String s="输出流例程";
		//byte[] b=s.getBytes();
		int[] a={1,2};
		try{
			//out.write(b);//将字节数组中的各字节写入文件
			out.write(1000);
			out.flush();  //强制输出
		}
		catch(IOException e){
			System.err.println("发生异常"+e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		mb_write(System.out);
	}
}
