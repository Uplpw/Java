//简介: 计算100以内所有素数之和


class mb_primesum{
	int prime;
	int sum=0;
	public mb_primesum(int n){
		prime=n;
	}
	public boolean mb_judge(int m){
		for(int j=2;j<=Math.sqrt(m);j++)
			if(m%j==0) return false;
		return true;
	}
	public int sum(){
		for(int i=3;i<100;i++){
			boolean mb=mb_judge(i);
			if(mb) {
				sum=sum+i;
				System.out.println(i);
			}
		}
		return sum+2;
	}
}
public class PrimeSum{
	public static void main(String[] args){
		mb_primesum mb_sum=new mb_primesum(100);
		System.out.println(mb_sum.sum());
	}
}
