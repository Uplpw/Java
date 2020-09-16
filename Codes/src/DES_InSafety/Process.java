package DES_InSafety;

import java.util.ArrayList;

public class Process {
	
	/*
	 * 输入的明文串转为0/1二进制串，并且可能补0使其长度为64的倍数   
	 * 输入：明文串
	 * 输出：0/1二进制串             
	 */
	public String processString(String str) {
		String string="";
		char[] charArray=str.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			string=string+decimalToBinary((int)charArray[i]);
		}
		if(string.length()%64==0) {
			return string;
		}else {
			//不是64的倍数则末尾加0
			int length=64-string.length()%64;
			for(int i=0;i<length;i++) {
				string=string+"0";
			}
			return string;
		}
	}

	/*
	 * 十进制整型转为二进制串
	 * 输入：十进制整型
	 * 输出：二进制串
	 */
	public String decimalToBinary(int decimal) {
		String str="";
		while(decimal!=0) {
			str=decimal%2+str;
			decimal=decimal/2;
		}
		int length=str.length();
		for(int i=0;i<8-length;i++) {
			str="0"+str;
		}
		return str;
	}
	
	/*
	 * 经过S盒变换后将范围在（0~15）的整型转为4位的二进制串，
	 * 输入：0~15内的整型
	 * 输出：4位二进制串
	 */
	public String decimalToBinaryS(int decimal) {
		String str="";
		while(decimal!=0) {
			str=decimal%2+str;
			decimal=decimal/2;
		}
		int length=str.length();
		for(int i=0;i<4-length;i++) {
			str="0"+str;
		}
		return str;
	}
	
	/*
	 * 在S盒中将6为二进制串分为两部分，一是首尾各1位结合形成行数（范围：0~3）、二是中间4位二进制形成列数（范围：0~15）
	 * 输入：二进制串
	 * 输出：二进制串的十进制整型表示
	 */
	public int binaryToDecimalS(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			int bit=Integer.parseInt(str.substring(i, i+1));
			for(int j=0;j<str.length()-i-1;j++) {
				bit=bit*2;
			}
			sum=sum+bit;
		}
		return sum;
	}
	
	/*
	 * 明文串的初始置换
	 * 输入：明文的二进制串1
	 * 输出：初始置换后的二进制串
	 */
	public String initSubstitute(String str) {
		int[] intChange= {58, 50, 42, 34, 26, 18, 10, 2,
						  60, 52, 44, 36, 28, 20, 12, 4,
						  62, 54, 46, 38, 30, 22, 14, 6,
						  64, 56, 48, 40, 32, 24, 16, 8,
						  57, 49, 41, 33, 25, 17, 9 , 1,
						  59, 51, 43, 35, 27, 19, 11, 3,
						  61, 53, 45, 37, 29, 21, 13, 5,
						  63, 55, 47, 39, 31, 23, 15, 7};
		int group=str.length()/64;
		String string="";
		for(int i=0;i<group;i++) {
			char[] charArray=str.substring(i*64, i*64+64).toCharArray();
			for(int j=0;j<charArray.length;j++) {
				string=string+charArray[intChange[j]-1];
			}
		}
		return string;
	}
	
	/*
	 * 16次迭代变换进行加密
	 * 输入：初始置换后的明文串、16个子密钥的集合
	 * 输出：16次迭代加密后的密文串
	 */
	public String iterationChange(String str, ArrayList<String> list) {
		String string = null;
		String stringReplace=str;
		int group=str.length()/64;
		
		for(int i=0;i<16;i++) {
			String tempString="";
			for(int j=0;j<group;j++) {
				String tempStr=stringReplace.substring(j*64, j*64+64);      //获得明文串的一个64位串
				String leftStr=tempStr.substring(0, 32);          //获取左32位
				String rightStr=tempStr.substring(32, 64);        //获取右32位
				tempString=tempString+rightStr+xorOperate(leftStr, 
										boxChange(boxS(xorOperate(extendStr(rightStr),list.get(i)))));
			}
			stringReplace=tempString;
			if(i==15) string=tempString;
		}
		return string;
	}
	
	/*
	 * 将明文串每64位一组中的左32位扩展到48位，便于与子密钥串进行异或
	 * 输入：明文串每64位一组中的左32位
	 * 输出：扩展后的48位串
	 */
	public String extendStr(String str) {
		int[] intExtend= {32, 1 , 2 , 3 , 4 , 5 ,
						  4 , 5 , 6 , 7 , 8 , 9 ,
						  8 , 9 , 10, 11, 12, 13,
						  12, 13, 14, 15, 16, 17,
						  16, 17, 18, 19, 20, 21,
						  20, 21, 22, 23, 24, 25,
						  24, 25, 26, 27, 28, 29,
						  28, 29, 30, 31, 32, 1};
		String string="";
		char[] charArray=str.toCharArray();
		for(int i=0;i<intExtend.length;i++) {
			string=string+charArray[intExtend[i]-1];
		}
		return string;
	}
	
	/*
	 * 明文串与子密钥串等之间的字符串异或操作
	 * 输入：两个长度相同的0/1字符串
	 * 输出：异或之后的0/1字符串
	 */
	public String xorOperate(String str1, String str2) {
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		String string="";
		for(int i=0;i<charArray1.length;i++) {
			if(charArray1[i]==charArray2[i]) {
				string=string+'0';
			}else {
				string=string+'1';
			}
		}
		return string;
	}
	
	/*
	 * 将第一次异或后的48位字串经过S盒后输出32位字串
	 * 输入：第一次异或后的48位字串
	 * 输出：经过S盒处理后的32字串
	 */
	public String boxS(String str) {
		int count=str.length()/6;
		String string="";
		for(int i=0;i<count;i++) {
			String tempStr=str.substring(i*6, i*6+6);
			String lineString=tempStr.substring(0, 1)+tempStr.substring(5, 6);
			int indexLine=binaryToDecimalS(lineString);
			String columnString=tempStr.substring(1, 5);
			int indexColumn=binaryToDecimalS(columnString);
			string=string+decimalToBinaryS(BoxS.s[i][indexLine][indexColumn]);
		}
		return string;
	}
	
	/*
	 * 将经过S盒处理后的32位字符串进行置换P操作，在第二次异或前
	 * 输入：经过S盒处理后的32位字符串
	 * 输出：置换后的32位字符串
	 */
	public String boxChange(String str) {
		int[] intChange= {16, 7, 20, 21,29, 12, 28, 17,
						  1, 15, 23, 26,5, 18, 31, 10,
						  2, 8, 24, 14,32, 27, 3, 9,
						  19, 13, 30, 6, 22, 11, 4, 25};
		char[] charArray=str.toCharArray();
		String string="";
		for(int i=0;i<intChange.length;i++) {
			string=string+charArray[intChange[i]-1];
		}
		return string;
	}
	
	/*
	 * 在得到16次迭代后的密文串后先进行左右32位互换、再进行逆置换
	 * 输入：16次迭代后的密文串
	 * 输出：最后逆置换后的密文串
	 */
	public String opposeSubstitute(String str) {
		int group=str.length()/64;
		String cipherText="";
		for(int i=0;i<group;i++) {
			String tempStr=str.substring(i*64, i*64+64);
			String string=tempStr.substring(32, 64)+tempStr.substring(0, 32);
			char[] charArray=string.toCharArray();
			int[] intIp= {40, 8, 48, 16, 56, 24, 64, 32,
						  39, 7, 47, 15, 55, 23, 63, 31,
						  38, 6, 46, 14, 54, 22, 62, 30,
						  37, 5, 45, 13, 53, 21, 61, 29,
						  36, 4, 44, 12, 52, 20, 60, 28,
						  35, 3, 43, 11, 51, 19, 59, 27,
						  34, 2, 42, 10, 50, 18, 58, 26,
						  33, 1, 41, 9, 49, 17, 57, 25};
			for(int j=0;j<intIp.length;j++) {
				cipherText=cipherText+charArray[intIp[j]-1];
			}
		}
		return cipherText;
	}
	
	/*
	 * 将最后得到的二进制密文串转为字符输出
	 * 输入：最后得到的二进制密文串
	 * 输出：每8位二进制串对应的字符
	 */
	public String toCharacter(String str) {
		int count=str.length()/8;
		String strChar="";
		for(int i=0;i<count;i++) {
			String string=str.substring(i*8, i*8+8);
			strChar=strChar+(char)binaryToDecimalS(string);
		}
		return strChar;
	}
}
