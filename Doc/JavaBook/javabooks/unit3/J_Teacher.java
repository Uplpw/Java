//��飺ְ������ʦ֮��ļ̳�

class J_Employee{
	public int m_workyear;          //����������
	
	public J_Employee(){
		m_workyear=1;
	}//J_Employee���췽������
}

class Teacher extends J_Employee{
	public int m_classhour;       //�ڿο�ʱ
	
	public Teacher(){
		m_classhour=99;
	}//J_Teacher���췽������
	
	public void printInfo(){            
		System.out.println("��ְ���Ĺ�������Ϊ"+m_workyear);
		System.out.println("��ְ���Ĺ���ʱ��Ϊ"+m_classhour);
	}
}
public class J_Teacher{
	public static void main(String[] args){
		Teacher teacher1=new Teacher();
		teacher1.printInfo();
	}
}
