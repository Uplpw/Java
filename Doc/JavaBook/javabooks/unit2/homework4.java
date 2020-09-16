public class homework4{
	public static void main(String[] args){
		int a=1;
		System.out.println((true | (++a==1)) & (a==2));
		
		int b=1;
		System.out.println((true || (++b==1)) & (b==2));
		
		int c=12;
		System.out.println(c*=2+3);
	}
}
