package software_method;

class Student{
	public static int classID = 1;
	//声明初始化
	public static String className = "班级";
	static{
		System.out.println("静态字段默认初始化 className = " + Student.className);
		System.out.println("静态字段默认初始化 classID = " + Student.classID);
		//静态代码块初始化
		classID = 100;
		System.out.println("静态代码块1 classID = " + Student.classID);
	}
	static{
		classID = 200;
		System.out.println("静态代码块2 classID = " + Student.classID);
	}
    //静态字段（相当于C语言的全局变量），默认初始化、静态块初始化、声明初始化
	//初始化过程：默认初始化 ---〉 静态块初始化 ---〉 声明初始化
	//默认初始化
	
	
	public static void showClassID(){
		System.out.println("调用Student.showClassID()，班级ID号是：" + className);
		System.out.println("调用Student.showClassID()，班级ID号是：" + classID);
	}
	
	public Student(int studentID,int age,String name) {
		System.out.println("实例字段默认初始化 studentID = " + this.studentID);
		System.out.println("实例字段声明初始化 age = " + this.age);
		System.out.println("实例字段默认初始化 name = " + this.name);

		this.studentID = studentID;
		this.age = age;
		this.name = name;

		System.out.println("实例字段实例构造方法初始化");
	}
	
	int studentID;
	//声明初始化
	int age = 18;
	String name;
}
public class Java_test {
	public static void main(String[] args) {
		Student s=new Student(111, 12, "lpw");
		Student.showClassID();
	}
}
