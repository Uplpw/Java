//文件输出流例程


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class J_WriteFile {
	public static void main(String[] args) throws IOException{
		String s="文件输出流例程1231";
		byte[] b=s.getBytes();
		try{
			FileOutputStream f=new FileOutputStream("out.txt");
			f.write(b);
			f.flush();
			f.close();
		}
		catch(IOException e){
			System.err.println("发生异常"+e);
			e.printStackTrace();
		}
	}
}
