//��飺��̬��̬��

public class J_student{
	int id;
	int age;
	public J_student(){
		setdata(2008001,99); 	//��������
	}
	public J_student(int id1,int age1){
		setdata(id1,age1);
	}
	public void setdata(int id1,int age1){   //��������
		id=id1;
		age=age1;
	}
	public void setdata(int id1){
		id=id1;
	}
	public static void main(String[] args){
		J_student jack=new J_student();
		//jack.setdata(2008010);
		J_student lisa=new J_student(2008009,100);
		System.out.print("jack��ѧ����:"+jack.id);
		System.out.println(", ������:"+jack.age);
		System.out.print("lisa��ѧ����:"+lisa.id);
		System.out.println(", ������:"+lisa.age);
	}
}
