//��飺�ض�������,����׼�����������ָ���Ľ�����Ӧ��ϵ


import java.io.FileInputStream;
public class J_SetIn {
	public static void main(String[] args){
		try{
			System.setIn(new FileInputStream("write.txt"));
			J_Echo.mb_echo(System.in);//��Ա����,����ļ�������
		}
		catch(Exception e){
			System.err.println("�����쳣��"+e);
			e.printStackTrace();
		}
	}
}
