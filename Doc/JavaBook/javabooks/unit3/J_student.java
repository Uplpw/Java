//简介：静态多态性

public class J_student{
	int id;
	int age;
	public J_student(){
		setdata(2008001,99); 	//方法调用
	}
	public J_student(int id1,int age1){
		setdata(id1,age1);
	}
	public void setdata(int id1,int age1){   //方法重载
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
		System.out.print("jack的学号是:"+jack.id);
		System.out.println(", 年龄是:"+jack.age);
		System.out.print("lisa的学号是:"+lisa.id);
		System.out.println(", 年龄是:"+lisa.age);
	}
}
