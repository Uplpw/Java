//���: ������������ֵ���ݹ���

class J_Time1{
	public int m_month=1;
}


public class J_Reference{
	public static void mb_method(J_Time1 t){
		System.out.println("��t.m_month++֮ǰt.m_month="+t.m_month);
		t.m_month++;
		System.out.println("��t.m_month++֮��t.m_month="+t.m_month);
	}
	public static void main(String[] args){
		J_Time1 a=new J_Time1();
		System.out.println("�� ��������ǰ����a.m_month="+a.m_month);
		mb_method(a);   //�� J_Primitive.mb_method(i)    ��̬��Ա����
		System.out.println("�� �������ú���� a.m_month="+a.m_month);
	}
}
