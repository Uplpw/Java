//���: ������Ϊ�ӿڵ������ڲ�������

interface J_Innerface{
	public static int m_data=100;
	
	public abstract void mb_method();
	//������J_Class����
}
public class J_InnerInterface {
	public static void main(String[] args){
		J_Innerface b=new J_Innerface(){
			public void mb_method(){
				System.out.println("m_data="+m_data);
			}//����mb_method����
		};//ʵ�ֽӿ�J_Innerface�������ڲ������
		b.mb_method();
	}
}
