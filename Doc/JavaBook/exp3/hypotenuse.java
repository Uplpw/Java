import java.util.Scanner;
import java.math.*;
public class hypotenuse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextDouble()){
			double x=sc.nextFloat();
			double y=sc.nextFloat();
			double s=Math.sqrt(x*x+y*y);
			System.out.println(s);
		}
		sc.close();
	}
}