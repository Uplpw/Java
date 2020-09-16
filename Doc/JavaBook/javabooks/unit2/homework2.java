public class homework2 {
	public static void main(String[] args){
 		int a=12;
		System.out.println((++a)+(a++));
                 //输出26，当执行++a后,a=13，所以（a++）中的 a 是13，不再算++（先进行操作在加运算），
 
		System.out.println(10&11|12);//输出14;位运算（按位与、或）

		System.out.println(5^7);//输出2;位运算（按位异或）

		System.out.println((-5)|(~5));//输出-5;位运算（取反）

		int b;
		b=~5;
		System.out.println(b);//输出-6;
	}
}
