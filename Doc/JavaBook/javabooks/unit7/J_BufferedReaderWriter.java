//��飺������Ķ�д������


import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.LineNumberReader;
public class J_BufferedReaderWriter {
	public static void main(String[] args){
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("test2.txt"));
			//�����������д��ʵ������
			bw.write("��־��,�¾���");//��д��д��
			bw.newLine();            //д���зָ���
			bw.write("������,�ղ���");
			bw.newLine();
			bw.close();
			
			LineNumberReader br=new LineNumberReader(new FileReader("test2.txt"));
			//�������ö�д��д����ļ�
			String s;
			for(s=br.readLine();s!=null;s=br.readLine())
				//��ȡһ���и�ֵ�ַ���s
				System.out.println(br.getLineNumber()+": "+s);//��������
			br.close();
		}
		catch(IOException e){
			System.err.println("�����쳣��"+e);
			e.printStackTrace();
		}
	}
}
