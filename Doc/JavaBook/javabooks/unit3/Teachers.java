//��飺ְ������ʦ֮��Ķ�̬��̬��

class Employee{
	public int workyear;          //����������
	
	public Employee(){
		workyear=1;
	}//Employee�Ĺ��췽������
	
	public void printInfo(){
		System.out.println("��ְ���Ĺ�������Ϊ"+workyear);
	}
}
public class Teachers extends Employee{
	int workhour;
	public Teachers(){
		workhour=180;
	}
	public void printInfo(){            //������д(����)
		System.out.println("��ְ���Ĺ�������Ϊ"+workyear);
		System.out.println("��ְ���Ĺ���ʱ��Ϊ"+workhour);
	}
	public static void main(String[] args){
		Employee a=new Employee();     //�����������
		a.printInfo();     //���ø��෽��
		//System.out.println(a instanceof Teachers);
		//System.out.println(a instanceof Employee);

		a=new Teachers();   //���ñ��� a ����ָ���������
		a.printInfo();     //�������෽��

		Employee b=a;
		//System.out.println(b instanceof Teachers);
		//System.out.println(b instanceof Employee);
		
	}
}
