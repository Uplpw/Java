//��飺�ӿ���̨���ڶ������ݵ�����


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class J_ReadData {
	public static void mb_printInfo(){
		System.out.println("�����������Ǹ�����?");
		System.out.println("\t0: �˳�; 1: ����; 2: ������");
	}
	
	public static int mb_getInt(BufferedReader f){
		try{
			String s=f.readLine();  //��ȡһ��������
			int i=Integer.parseInt(s);//������ת��Ϊ����
			return i;
		}
		catch(Exception e){
			return -1;
		}
	}
	
	public static double mb_getDouble(BufferedReader f){
		try{
			String s=f.readLine();
			double d=Double.parseDouble(s);
			return d;
		}
		catch(Exception e){
			return 0d;
		}
	}
	
	public static void main(String[] args){
		int i;
		double d;
		try{
			BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
			do{
				mb_printInfo();
				i=mb_getInt(f);
				if(i==0)
					break;
				else if(i==1){
					System.out.print("\t����������: ");
					i=mb_getInt(f);
					System.out.println("\t��������: "+i);
				}
				else if(i==2){
					System.out.print("\t�����븡����: ");
					d=mb_getDouble(f);
					System.out.println("\t���븡����: "+d);
				}
			}
			while(true);
			f.close();
		}
		catch(Exception e){
			System.err.println("�����쳣;"+e);
			e.printStackTrace();
		}
	}
}
