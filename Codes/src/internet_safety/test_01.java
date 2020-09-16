package internet_safety;
import java.util.Scanner;
/*
 * 移位密码加密
 */
public class test_01 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char[] array=sc.nextLine().toCharArray(); //明文
		int ciper=sc.nextInt();  //密钥
		for(int i=0;i<array.length;i++) 
			System.out.print((char)((int)((array[i]+i+ciper))%26+97));  //输出密文
		sc.close();
	}
}
