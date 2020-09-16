import java.util.Scanner;
public class breaks{
	public static void main(String[] args){
		/*int i=0;
		leap:
		{
			System.out.println("Hello!");
			if(i==0)
			break leap;
			System.out.println("Hi! Friends");
		}
		System.out.println("Hi!");*/
		
		int studentgrade;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
		studentgrade=sc.nextInt();
		switch(studentgrade)
		{
		case 1:
		case 2:
		  System.out.println("A");break;
		case 3:
		case 4:
		  System.out.println("B");break;
		case 5:
		case 6:
		  System.out.println("C");break;
		case 7:
		case 8:
		  System.out.println("D");break;
		default:
		  System.out.println("Error");break;
		}
	}
	}
}