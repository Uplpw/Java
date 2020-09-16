import java.util.Scanner;
public class Factor{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int s=1;
			int x=sc.nextInt();
			for(int i=1;i<=x;i++)
			s=s*i;
			System.out.println(s);
		}
		sc.close();
	}
}
