//��飺���������


import java.io.IOException;
import java.io.OutputStream; //��׼�������
public class J_Write {
	public static void mb_write(OutputStream out){
		//String s="���������";
		//byte[] b=s.getBytes();
		int[] a={1,2};
		try{
			//out.write(b);//���ֽ������еĸ��ֽ�д���ļ�
			out.write(1000);
			out.flush();  //ǿ�����
		}
		catch(IOException e){
			System.err.println("�����쳣"+e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		mb_write(System.out);
	}
}
