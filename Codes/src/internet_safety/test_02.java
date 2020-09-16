package internet_safety;
import java.util.Scanner;
/*
 * 维吉尼亚密码加密
 */
public class test_02 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入明文：");
		char[] array=sc.nextLine().toLowerCase().toCharArray(); //明文
		System.out.print("请输入密钥：");
		char[] ciper=sc.nextLine().toLowerCase().toCharArray(); //密钥
		int i=0;
		System.out.print("密文：");
		while(i<array.length) {
			System.out.print((char)((array[i]-'a'+ciper[i%ciper.length]-'a')%26+97));
			i++;
		}
		System.out.println();
		sc.close();
	}
}
