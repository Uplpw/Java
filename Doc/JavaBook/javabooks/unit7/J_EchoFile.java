//��飺��ȡ�ļ�"test.txt"���ݵ�����


import java.io.FileInputStream; //�����������࣬
import java.io.IOException;
public class J_EchoFile {
	public static void main(String[] args){
		try{
			FileInputStream f=new FileInputStream("test.txt"); //����������󣬲����ļ�
			int i=0;
			int b=f.read();          //��ȡ�ļ��е��ֽ�
			for(i=0;b!=-1;i++){
				System.out.print((char)b);
				b=f.read();
			}
			System.out.println();
			System.out.println("�ļ�\"test.txt\"�ֽ���Ϊ"+i);
			f.close();
		}
		catch(IOException e){
			System.out.println("�����쳣:"+e);
			e.printStackTrace();
		}
	}
}
