abstract class Personnel
{
	String name;
	int age;
	String occupation;
	public abstract String talk(); //声明一抽象方法talk();
	/*抽象方法只需声明，不需实现。*/
}
class Student extends Personnel  //Student 类继承 Personnel类；
{
	public Student(String name, int age, String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String talk()  //复写 talk()方法
	{
		return "Student--name: "+this.name+", age: "+this.age+", occupation: "+
	           this.occupation+"!";
	}
}
class Worker extends Personnel   //Worker 类继承 Personnel类
{
	public Worker(String name, int age, String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String talk()
	{
		return "Worker--name: "+this.name+", age: "+this.age+", occupation: "+
	           this.occupation+"!";
	}
}
public class Test_4 {
	public static void main(String[] args){
		Student t=new Student("艾希",20,"student");
		Worker w=new Worker("斯蒂芬",40,"worker");
		System.out.println(t.talk());
		System.out.println(w.talk());
	}
}
