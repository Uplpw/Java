//��飺��������ļ�����


import java.io.IOException;
import java.io.RandomAccessFile;
public class J_RandomAccessFile {
	public static void main(String[] args){
		try{
			RandomAccessFile f=new RandomAccessFile("trt.txt","rw");
			//�����������ʵ������,���� rw ��ʽ����
			int i;
			double d;
			for(i=0;i<10;i++){
				f.writeDouble(i*Math.PI);
			}
			f.seek(16);  //��λ����16���ֽڴ�ĩβ
			f.writeDouble(0);
			f.seek(0);   //��λ����0���ֽڴ�ĩβ�����ײ�
			for(i=0;i<10;i++){
				d=f.readDouble();
				System.out.println("["+i+"]:"+d);
			}
			f.close();
		}
		catch(IOException e){
			System.err.println("�����쳣;"+e);
			e.printStackTrace();
		}
	}
}
