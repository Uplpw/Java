

public class BasicArray1 {
	static int[] thisArray={2,4,6,8};
	
	class Factorial{
		public int factorial(int n){
			if(n==0 || n==1)
				return 1;
			else return n*factorial(n-1);
		}
	}
	
	
	
	public static void main(String[] args){
		BasicArray1 b=new BasicArray1();
		BasicArray1.Factorial f=b.new Factorial();//内部类实例化
		for(int i=0;i<4;i++){
			int k=f.factorial(thisArray[i]);
			System.out.println(k);
		}
	}
}
