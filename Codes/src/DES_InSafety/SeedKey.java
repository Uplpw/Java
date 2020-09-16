package DES_InSafety;

import java.util.ArrayList;
import java.util.Random;

public class SeedKey {
	private String seedKey;        //56位密钥（不包含8位奇偶校验位）
	
	/*
	 *构造方法 生成56位密钥，并赋值给变量seedKey
	 */
	public SeedKey() {
		String key="";
		Random r=new Random();
		for(int i=0;i<56;i++) {
			key=key+r.nextInt(2);
		}
		this.seedKey=key;
	}
	
	/*
	 * 判断奇偶校验位1/0,
	 * 输入：56位密钥中的每7位字串
	 * 输出：奇偶校验位是0返回true,否则false
	 */
	public boolean countOne(String str) {
		int count=0;
		char[] charArray=str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]=='1') {
				count++;
			}
		}
		if(count%2==1) {
			return true;
		}else {
			return false;
		}
			
	}
	
	/*
	 * 对类属性seedKey（56位密钥）添加奇偶校验位
	 * 输出：返回64位 种子密钥
	 */
	public String checkAdd() {
		String string="";
		for(int i=0;i<8;i++) {
			String str=this.seedKey.substring(i*7, i*7+7);
			if(countOne(str)==true) {
				string=string+str+"0";
			}else {
				string=string+str+"1";
			}
		}
		return string;
	}
	
	/*
	 * 对种子密钥进行置换
	 * 输入：种子密钥64位
	 * 输出：PC-1置换后的56位密钥
	 */
	public String realign(String str) {
		int[] intArray= {57, 49, 41, 33, 25, 17, 9 ,
						 1 , 58, 50, 42, 34, 26, 18,
						 10, 2 , 59, 51, 43, 35, 27,
						 19, 11, 3 , 60, 52, 44, 36,
						 63, 55, 47, 39, 31, 23, 15,
						 7 , 62, 54, 46, 38, 30, 22,
						 14, 6 , 61, 53, 45, 37, 29,
						 21, 13, 5 , 28, 20, 12, 4 };
		char[] charArray=str.toCharArray();
		String strKey="";
		for(int i=0;i<intArray.length;i++) {
			strKey=strKey+charArray[intArray[i]-1];
		}
		return strKey;  
	}
	
	/*
	 * 生成16个子密钥（48位）
	 * 输入：56位密钥（不包含奇偶校验并PC-1置换后）
	 * 输出：16个48位子密钥的集合
	 */
	public ArrayList<String> produceSubKey(String str){
		ArrayList<String> listSubKey=new ArrayList<String>();  //子密钥集合
		
		//迭代16次的移位
		int[] intArray= {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};
		
		/*
		int[] moveArray={1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, 19, 19, 19, 19, 20};
		 */
		String strC0=str.substring(0, 28);
		String strD0=str.substring(28, 56);
		for(int i=0; i<16; i++) {
			int countMove=0;
			for(int j=0;j<=i;j++) {
				countMove=countMove+intArray[j];
			}
			listSubKey.add(subSelect(moveBit(strC0, countMove)+moveBit(strD0, countMove)));
		}
		return listSubKey;
	}
	
	/*
	 * 移位变换
	 * 输入：28位左、右的密钥字串(LSi)以及移位的大小，  左移
	 * 输出：28位移位变换后的密钥字串
	 */
	public String moveBit(String str, int e) {
		char[] charArray=str.toCharArray();
		int length=charArray.length;
		String strMove="";
		for(int i=0;i<length;i++) {
			strMove=strMove+charArray[(i+e)%length];
		}
		return strMove;
	}
	
	/*
	 * 在移位变换后，置换56位密钥选择生成48位子密钥
	 * 输入：经过移位变换的56位密钥
	 * 输出：迭代16次中用于异或操作的48位子密钥
	 */
	public String subSelect(String str) {
		int[] intSelect={14, 17, 11, 24, 1 , 5 ,
						 3 , 28, 15, 6 , 21, 10,
						 23, 19, 12, 4 , 26, 8 ,
						 16, 7 , 27, 20, 13, 2 ,
						 41, 52, 31, 37, 47, 55,
						 30, 40, 51, 45, 33, 48,
						 44, 49, 39, 56, 34, 53,
						 46, 42, 50, 36, 29, 32};
		char[] charArray=str.toCharArray();
		String strSelect="";
		for(int i=0;i<intSelect.length;i++) {
			strSelect=strSelect+charArray[intSelect[i]-1];
		}
		return strSelect;
	}
}
