//��飺���벻�������ڶ�ȡ����ʱ��Ч�ʱȽ�����


import java.io.BufferedInputStream;
import java.io.FileInputStream; 
import java.util.Date;
public class J_BufferedInputStream {
	private static String f_name="J_BufferedInputStream.txt";
	
	public static void main(String[] args){
		try{
			int i,ch;
			i=0;
			Date d1=new Date();//������ǰʱ���ʵ������
			FileInputStream f=new FileInputStream(f_name);
			while((ch=f.read())!=-1)
				i++;
			f.close();
			Date d2=new Date();
			
			long t=d2.getTime()-d1.getTime();//���ص�ǰʱ���ʵ������
			System.out.printf("��ȡ�ļ�%1$s(��%2$d�ֽ�)%n",f_name,i);
			System.out.printf("��������ķ�����Ҫ%1$dms%n",t);
			
			i=0;
			d1=new Date();
			f=new FileInputStream(f_name);
			BufferedInputStream fb=new BufferedInputStream(f);//Ƕ��װ��
			while((ch=fb.read())!=-1)
				i++;
			f.close();
			d2=new Date();
			t=d2.getTime()-d1.getTime();
			System.out.printf("������ķ�����Ҫ%1$dms%n",t);
		}
		catch(Exception e){
			System.out.println("�����쳣��"+e);
			e.printStackTrace();
		}
	}
}
