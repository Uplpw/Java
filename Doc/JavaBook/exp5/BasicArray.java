
class Factorial{
	public int factorial(int n){
		if(n==0 || n==1)
			return 1;
		else return n*factorial(n-1);
	}
}
public class BasicArray {
	
	static int[] thisArray={2,4,6,8};
	
	public static void main(String[] args){
		Factorial f=new Factorial();
		for(int i=0;i<4;i++){
			int k=f.factorial(thisArray[i]);
			System.out.println(k);
		}
	}
}
