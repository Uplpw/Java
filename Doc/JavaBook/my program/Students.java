import java.util.Scanner; 
class Student{
	int number;
	String name;
	int age;
	int ChineseGrade;
	int EnglishGrade;
	int MathGrade;
	public Student(int number,String name,int age,
			       int ChineseGrade,int EnglishGrade,int MathGrade)
	{
		this.number=number;
		this.name=name;
		this.age=age;
		this.ChineseGrade=ChineseGrade;
		this.EnglishGrade=EnglishGrade;
		this.MathGrade=MathGrade;
	}
	public String Show()
	{
		return "Number: "+this.number+", name: "+this.name+", age: "+this.age;
	}
	public String AllGrade()
	{
		return "All: "+(this.ChineseGrade+this.EnglishGrade+this.MathGrade);
	}
}
public class Students {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int number,age,ChineseGrade,EnglishGrade,MathGrade;
			String name;
			//System.out.println("Please Enter Name: ");
			name=sc.nextLine();
			//System.out.println("Please Enter Number: ");
			number=sc.nextInt();
			//System.out.println("Please Enter Age: ");
			age=sc.nextInt();
			//System.out.println("Please Enter ChineseGrade:");
			ChineseGrade=sc.nextInt();
			//System.out.println("Please Enter EnglishGrade: ");
			EnglishGrade=sc.nextInt();
			//System.out.println("Please Enter MathGrade: ");
			MathGrade=sc.nextInt();
			Student s=new Student(number,name,age,ChineseGrade,
					      EnglishGrade,MathGrade);
			System.out.println(s.Show());
			System.out.println(s.AllGrade());
		}
		sc.close();
	}
}
