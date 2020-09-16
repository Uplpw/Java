//简介：职工和老师之间的动态多态性

class Employee{
	public int workyear;          //工作的年限
	
	public Employee(){
		workyear=1;
	}//Employee的构造方法结束
	
	public void printInfo(){
		System.out.println("该职工的工作年限为"+workyear);
	}
}
public class Teachers extends Employee{
	int workhour;
	public Teachers(){
		workhour=180;
	}
	public void printInfo(){            //方法重写(覆盖)
		System.out.println("该职工的工作年限为"+workyear);
		System.out.println("该职工的工作时长为"+workhour);
	}
	public static void main(String[] args){
		Employee a=new Employee();     //创建父类对象
		a.printInfo();     //调用父类方法
		//System.out.println(a instanceof Teachers);
		//System.out.println(a instanceof Employee);

		a=new Teachers();   //引用变量 a 重新指向子类对象
		a.printInfo();     //调用子类方法

		Employee b=a;
		//System.out.println(b instanceof Teachers);
		//System.out.println(b instanceof Employee);
		
	}
}
