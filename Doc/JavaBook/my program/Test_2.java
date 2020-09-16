class Person1{
	String name;
	int age;
	static String city = "Ame";//static声明的属性是所有对象共享；
	public Person1(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
    public String talk()
	{
    	return "I am "+this.name+", my age is "+this.age+", from "+city;
	}
}
public class Test_2 {
	public static void main(String[] args){
		Person1 p1=new Person1("LPW",18);
		Person1 p2=new Person1("LPP",18);
		Person1 p3=new Person1("LLL",18);
		//p1.city="Americ";
		System.out.println(p1.talk());
		System.out.println(p2.talk());
		System.out.println(p3.talk());
	}
}
