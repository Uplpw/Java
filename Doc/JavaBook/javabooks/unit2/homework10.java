//import java.math.*;
public class homework10{
	public static void main(String[] args){
		int[] prime=new int[100];
		int k=0,i;
		for(i=50;i<=100;i++){
			int flag=0;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				prime[k]=i;
			    k++;
			}
		}
		for(int j=0;j<prime.length;j++)
			if(prime[j]!=0) System.out.println(prime[j]);
	}
}
