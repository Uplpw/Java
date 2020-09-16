package Security;

import java.util.Scanner;

public class Security {
	//加密方法
	public int encryptProcess(int intMessage, int N, int e) {
		int tempInt=1;
		for(int i=0;i<e;i++) {
			tempInt=tempInt*intMessage%N;
		}
		return tempInt;
	}
		
	//解密方法
	public int decryptProcess(int intMessage, int N, int d) {
		int tempInt=1;
		for(int i=0;i<d;i++) {
			tempInt=tempInt*intMessage%N;
		}
		return tempInt;
	}
		
	//获取e的模反元素
	public int getInverse(int N, int e) {
		int p=gcd(N);
		int r=(p-1)*(N/p-1);
		int d=-1;
		for(int i=1;i<=r;i++) {
		    if(e*i%r==1) {
		    	d=i;
		    	break;
		    }
		}
		return d;
	}

	public int gcd(int n) {
		int x=-1;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				x=i;
				break;
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Security security=new Security();
		
		System.out.println("输入明文：");
		int intMessage=sc.nextInt();
		int ciphertext=security.encryptProcess(intMessage, 1147, 61);
		System.out.println("加密后的密文："+ciphertext);
		//int inverse=getInverse(1147, 301);
		System.out.println("解密后的明文："+security.decryptProcess(ciphertext, 1147, 301));
		sc.close();
	}

	
}
