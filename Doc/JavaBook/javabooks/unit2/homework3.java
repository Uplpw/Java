import java.util.Scanner;
public class homework3 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] array=new int[64];
		int i;
		while(sc.hasNextInt()){
			int bit=sc.nextInt();
			i=63;
			while(bit!=0){
				array[i]=bit%2;
				bit=bit/2;
				i--;
			}
			for(int j=++i;j<array.length;j++)
			System.out.print(array[j]+" ");
			System.out.println();
		}
		sc.close();
	}
}
