//��飺�ļ���д������


import java.io.IOException;
import java.io.FileReader;//���ַ���ȡ��д��
import java.io.FileWriter;
public class J_FileReaderWriter {
	public static void main(String args[]){
		try{
			FileWriter f_out=new FileWriter("Test1.txt");//������д��ʵ������
			f_out.write("��־���¾���888***sudida������");//д���ַ���
			f_out.close();
			
			FileReader f_in=new FileReader("Test1.txt");//�������ļ�
			for(int c=f_in.read();c!=-1;c=f_in.read())//ѭ������ļ��е��ַ�
				System.out.println((char)c);
			f_in.close();
		}
		catch(IOException e){
			System.err.println("�����쳣��"+e);
			e.printStackTrace();
		}
	}
}
