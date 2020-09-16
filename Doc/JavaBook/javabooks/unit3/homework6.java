//简介: 给定一个整数，输出这个整数的二进制、八进制、十六进制数

import java.util.Scanner;
public class homework6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int x=sc.nextInt();
			System.out.println(Integer.toBinaryString(x));   //转为二进制
			
			System.out.println(Integer.toOctalString(x));    //转为八进制
			
			System.out.println(Integer.toHexString(x));      //转为十六进制
		}
		sc.close();
	}
}
