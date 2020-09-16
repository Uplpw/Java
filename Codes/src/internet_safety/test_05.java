package internet_safety;

public class test_05 {
	
	//明文转二进制串
	public String change(String str) {
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
	
	//十进制转为二进制
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
	
	//初始置换
	public String substitute(String str) {
		int group=str.length()/64;
		String string="";
		for(int i=0;i<group;i++) {
			char[] charArray=str.substring(i*64, i*64+64).toCharArray();
			int index_one=58, index_two=57;
			for(int j=0;j<64;j++) {
				if(j<32) {
					string=string+charArray[index_one];
					index_one=index_one-8;
					if(j%8==7) {
						index_one=index_one+58;
					}
				}else {
					string=string+charArray[index_two];
					index_two=index_two-8;
					if(j%8==7) {
						index_one=index_one+58;
					}
				}
			}
		}
		return string;
	}
	
	//16次迭代变换
	public String iterationChange(String str) {
		String string="";
		int group=str.length()/64;
		for(int i=0;i<16;i++) {
			String tempStr=str;
			String tempString="";
			for(int j=0;j<group;j++) {
				char[] charArray=tempStr.substring(j*64, j*64+64).toCharArray();
				tempString=tempString+charArray.toString().substring(32, 63);
			}
		}
		return string;
	}
	public static void main(String[] args) { 
		test_05 t=new test_05();
		System.out.println(t.change("abc"));
	}
}
