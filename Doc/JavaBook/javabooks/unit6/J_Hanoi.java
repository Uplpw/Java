//简介：利用递归求解汉诺塔（Tower of Hanoi）问题的例程


public class J_Hanoi {
	public static void mb_hanoi(int n, char start, char temp, char end){
		if(n<=1)
			System.out.println("将盘从"+start+"移到"+end);
		else{
			mb_hanoi(n-1,start,end,temp);
			System.out.println("将盘从"+start+"移到"+end);
			mb_hanoi(n-1,temp,start,end);
		}
	}
	
	public static void main(String args[]){
		mb_hanoi(3,'S','T','E');
	}
}
