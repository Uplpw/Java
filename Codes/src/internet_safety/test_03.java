package internet_safety;

import java.util.Scanner;
/*
 * 仿射密码加密
 */
public class test_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入明文：");
		char[] array=sc.nextLine().toCharArray(); //明文
		System.out.println("输入密钥：");
		System.out.print("a=");
		int ciperA=sc.nextInt();  
		System.out.print("b=");
		int ciperB=sc.nextInt();  
		System.out.print("输出密文：");
		for(int i=0;i<array.length;i++) {
			System.out.print((char)((ciperA*(int)array[i]+ciperB-97)%26+97));  //输出密文
		}
		sc.close();
	}
}
