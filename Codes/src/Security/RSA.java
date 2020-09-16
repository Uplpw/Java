package Security;

import java.util.Scanner;

public class RSA {
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
	
	//签名
	public String Sign(int data, int[] arrayA, int An, int[] arrayB, int Bn) {
		String tempStr=null;
		
		//先用A的私钥对data加密
		int tempAData=encryptProcess(data, An, arrayA[1]);
		
		//再用B的公钥进行加密
		int tempADataOne=encryptProcess(data, Bn, arrayB[0]);
		int tempADataTwo=encryptProcess(tempAData, Bn, arrayB[0]);
		
		//转为字符串发送
		tempStr=String.valueOf(tempADataOne)+" "+String.valueOf(tempADataTwo);
		
		return tempStr;
	}
	
	//解签
	public String UnSign(String data, int[] arrayA, int An, int[] arrayB, int Bn) {
		String tempStr="";
		String[] str=data.split(" ");
		for(int i=0;i<str.length;i++) {
			int tempDataOne=decryptProcess(Integer.parseInt(str[i]), Bn, arrayB[1]);
			if(i==str.length-1) {
				//后面的数据（经过A的私钥加密），用A的公钥进行解密
				tempDataOne=decryptProcess(tempDataOne, An, arrayA[0]);
				tempStr=tempStr+String.valueOf(tempDataOne);
			}else {
				//前面的数据（未经过A的私钥加密）
				tempStr=tempStr+String.valueOf(tempDataOne)+" ";
			}
		}
		return tempStr;
	}
	public static void main(String[] args) {
		//设置两对公钥与私钥，针对A和B通信，进行签名
		//假设A回复 123 给B
		
		//设置A的公钥与私钥分别是301、61
		int[] A= {301,61};       //[e,d]
		int An=1147;             //31*37(p*q)
		
		//设置B的公钥与私钥分别是1721、201
		int[] B= {1721,201};      //[e,d]
		int Bn=1927;              //41*47(p*q)
		
		Scanner sc=new Scanner(System.in);
		RSA rsa=new RSA();
		
		System.out.println("A输出回复的信息：");
		int data=sc.nextInt();
		String str=rsa.Sign(data, A, An, B, Bn);    //签名
		System.out.println(str);
		
		str=rsa.UnSign(str, A, An, B, Bn);          //解签
		System.out.println(str);
		sc.close();
	}
	
	
}
