class Personal{
	String name;
	int age;
	String city;
	public Personal(String name1, int age1, String city1)
	{
		name=name1;
		age=age1;
		city=city1;
	}
    public String talk()
	{
    	return "I am "+name+", my age is "+age+", from "+city;
	}
}
public class Test_1 {
	public static void main(String args[]){
		Personal p1=new Personal("LPW",18,"china");
		Personal p2=new Personal("LPP",18,"china");
		Personal p3=new Personal("LLL",18,"china");
		System.out.println(p1.talk());
		System.out.println(p2.talk());
		System.out.println(p3.talk());
	}
}
