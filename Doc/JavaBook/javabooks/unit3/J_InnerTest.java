//���: ʵ���ڲ�������

class J_Test{
	int m_outer=1;
	static int m_outers=2;
	
	class J_Inner{
		int m_inner;
		static final int m_inners=4;
		
		public J_Inner(){
			m_inner=3;
		}//J_Inner�Ĺ��췽������
		
		public void mb_method(){
			System.out.println("m_outer="+m_outer);
			System.out.println("m_outers="+m_outers);  //�����ⲿ�෽��
			System.out.println("m_inner="+m_inner);
			System.out.println("m_inners="+m_inners);   //�����ڲ��෽��
			mb_methodouter();
		}//mb_method��������
		
		public void mb_methodouter(){
			System.out.println("m_outer="+m_outer);
		}//mb_methodouter��������
	}
}
public class J_InnerTest {
	public static void main(String[] args){
		J_Test a=new J_Test();            //�����ⲿ����� a
		J_Test.J_Inner b=a.new J_Inner();   //�����ڲ������ b
		b.mb_method();  //�ڲ��������÷���
	}
}
