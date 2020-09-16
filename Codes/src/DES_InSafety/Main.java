package DES_InSafety;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//输入明文
		Scanner sc=new Scanner(System.in);
		System.out.println("输入明文串：");
		String str=sc.nextLine();
		
		//获取16个子密钥
		SeedKey sk=new SeedKey();
		ArrayList<String> list=sk.produceSubKey(sk.realign(sk.checkAdd()));
		
		//明文串的加密过程
		Process process=new Process();
		String text=process.opposeSubstitute(
				process.iterationChange(process.initSubstitute(process.processString(str)), list));
		
		//输出密文串及对应的字符
		System.out.println("密文的二进制串："+text);
		System.out.println(process.toCharacter(text));
		sc.close();

	}
}
