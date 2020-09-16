class Person3
{
	String name;
	int age;
}
class Person2 extends Person3
{
	String school;
}
public class Test_3 {
	public static void main(String[] args){
		Person2 p=new Person2();
		p.name="艾希";
		p.age=20;
		p.school="zzu";
		System.out.println("姓名："+p.name+", 年龄："+p.age+", 学校："+p.school);
	}
}
