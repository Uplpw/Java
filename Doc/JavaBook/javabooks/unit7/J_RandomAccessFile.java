//简介：随机访问文件例程


import java.io.IOException;
import java.io.RandomAccessFile;
public class J_RandomAccessFile {
	public static void main(String[] args){
		try{
			RandomAccessFile f=new RandomAccessFile("trt.txt","rw");
			//创建随机访问实例对象,并以 rw 方式访问
			int i;
			double d;
			for(i=0;i<10;i++){
				f.writeDouble(i*Math.PI);
			}
			f.seek(16);  //定位到第16个字节处末尾
			f.writeDouble(0);
			f.seek(0);   //定位到第0个字节处末尾，即首部
			for(i=0;i<10;i++){
				d=f.readDouble();
				System.out.println("["+i+"]:"+d);
			}
			f.close();
		}
		catch(IOException e){
			System.err.println("发生异常;"+e);
			e.printStackTrace();
		}
	}
}
