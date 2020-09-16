public class J_Swap{
	public static void main(String args[]){
		int a=123456;
		int b=654321;
		System.out.println("a="+a+", b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+", b="+b);   //“ÏªÚΩªªªa,b
	}
}