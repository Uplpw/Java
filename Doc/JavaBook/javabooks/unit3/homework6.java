//���: ����һ�������������������Ķ����ơ��˽��ơ�ʮ��������

import java.util.Scanner;
public class homework6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int x=sc.nextInt();
			System.out.println(Integer.toBinaryString(x));   //תΪ������
			
			System.out.println(Integer.toOctalString(x));    //תΪ�˽���
			
			System.out.println(Integer.toHexString(x));      //תΪʮ������
		}
		sc.close();
	}
}
