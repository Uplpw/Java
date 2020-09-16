//简介：带缓存的读写器例程


import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.LineNumberReader;
public class J_BufferedReaderWriter {
	public static void main(String[] args){
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("test2.txt"));
			//创建带缓存读写器实例对象
			bw.write("有志者,事竟成");//读写器写入
			bw.newLine();            //写入行分隔符
			bw.write("苦心人,终不负");
			bw.newLine();
			bw.close();
			
			LineNumberReader br=new LineNumberReader(new FileReader("test2.txt"));
			//打开已有用读写器写入的文件
			String s;
			for(s=br.readLine();s!=null;s=br.readLine())
				//读取一整行赋值字符串s
				System.out.println(br.getLineNumber()+": "+s);//获得行序号
			br.close();
		}
		catch(IOException e){
			System.err.println("发生异常："+e);
			e.printStackTrace();
		}
	}
}
