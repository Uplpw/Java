//简介：带与不带缓冲在读取数据时的效率比较例程


import java.io.BufferedInputStream;
import java.io.FileInputStream; 
import java.util.Date;
public class J_BufferedInputStream {
	private static String f_name="J_BufferedInputStream.txt";
	
	public static void main(String[] args){
		try{
			int i,ch;
			i=0;
			Date d1=new Date();//创建当前时间的实例对象
			FileInputStream f=new FileInputStream(f_name);
			while((ch=f.read())!=-1)
				i++;
			f.close();
			Date d2=new Date();
			
			long t=d2.getTime()-d1.getTime();//返回当前时间的实例对象
			System.out.printf("读取文件%1$s(共%2$d字节)%n",f_name,i);
			System.out.printf("不带缓冲的方法需要%1$dms%n",t);
			
			i=0;
			d1=new Date();
			f=new FileInputStream(f_name);
			BufferedInputStream fb=new BufferedInputStream(f);//嵌套装饰
			while((ch=fb.read())!=-1)
				i++;
			f.close();
			d2=new Date();
			t=d2.getTime()-d1.getTime();
			System.out.printf("带缓冲的方法需要%1$dms%n",t);
		}
		catch(Exception e){
			System.out.println("发生异常："+e);
			e.printStackTrace();
		}
	}
}
