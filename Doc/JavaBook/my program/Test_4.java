abstract class Personnel
{
	String name;
	int age;
	String occupation;
	public abstract String talk(); //����һ���󷽷�talk();
	/*���󷽷�ֻ������������ʵ�֡�*/
}
class Student extends Personnel  //Student ��̳� Personnel�ࣻ
{
	public Student(String name, int age, String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String talk()  //��д talk()����
	{
		return "Student--name: "+this.name+", age: "+this.age+", occupation: "+
	           this.occupation+"!";
	}
}
class Worker extends Personnel   //Worker ��̳� Personnel��
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
		Student t=new Student("��ϣ",20,"student");
		Worker w=new Worker("˹�ٷ�",40,"worker");
		System.out.println(t.talk());
		System.out.println(w.talk());
	}
}
