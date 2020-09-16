//简介: 字符串类  String 的相关用法实例


import java.util.Vector;
public class J_String{
	public static void main(String[] args){
		
		/*//字符串的几种表示
		String str="123456789";   //字符串直接量
		String str1="123"+"456"+"789";   //字符串直接量
		String str2=new String("123456789");   //构造字符串类
		System.out.println("str"+((str==str1)?"==" : "!=")+"str1");
			//比较字符串直接量str和拼接字符串类直接量str1
		System.out.println("str"+((str==str2)?"==" : "!=")+"str2");
			//比较字符串直接量str和构造字符串str2
		*/
		
		/*//字符串数组的表示
		String[] s=new String[3];  //创建字符串数组s
		//s[0]="abc";             //创建字符串直接量
		s[0]=new String("abc");      //构造String类 对象s[0]
		//s[1]="def";             //创建字符串直接量
		s[1]=new String("def");      //构造String类 对象s[1]
		//s[2]="ghi";             //创建字符串直接量
		s[2]=new String("ghi");      //构造String类 对象s[2]
		//String s1[]={"123","456","789"};   //字符数组初始化
		String s1[]={new String("123"),new String("456"),new String("789")};
		
		for(int i=0;i<s.length;i++){      //输出字符串数组 s[]
			System.out.println(s[i]);
			System.out.println(s1[i]);
		}
		*/
		
		/////String类的构造方法
		
		/*//public String()构造方法
		String s1=new String();   //构造空字符串，不含任何字符
		String s2=null;           //不指向任何一个字符串对象
		System.out.println(s1+", "+s2);     //输出s1,s2的结果
		
		//public String(byte[] bytes)构造方法
		byte b[]={'a','b','c'};  //创建字节数组  b[]
		String ss=new String(b);  
 		System.out.println(ss);
 		
 		//public String(char[] value)构造方法
 		char c[]={'1','2','3'};   //创建字符数组  c[]
 		String ss1=new String(c);   
 		System.out.println(ss1);
 		
 		//public String(String original)构造方法
 		String stt="cdcd";
 		String str=new String(stt);
 		String str1=new String(str);
 		System.out.println(str1);
 		
 		//public String(StringBuffer buffer)构造方法
 		
 		*/
 		
 		/////String类的成员方法
 		
 		/*public static String valueOf(boolean b)成员方法,
			将boolean类型转化为字符串类型*/
 		/*String s1=String.valueOf(true);        //参数是boolean类型
 		String s2=String.valueOf(false);
 		System.out.println(s1+", "+s2);
 		*/
		
 		//public static String valueOf(char c)成员方法，将字符型转化为字符串类型
 		/*String s3=String.valueOf('1');
 		String s4=String.valueOf('2');
 		System.out.println(s3+", "+s4);
 		*/
		
 		/*public static String valueOf(int i)成员方法（int 可换为  long ）
 			将整型转化为字符串类型*/
 		/*String ss1=String.valueOf(100);
 		String ss2=String.valueOf(200);
 		System.out.println(ss1+", "+ss2);
 		*/
		
 		/*public static String valueOf(float f)成员方法（float 可换为   double）
 		  	将浮点型转化为字符串类型*/
 		/*String sss1=String.valueOf(3.1415926);
 		String sss2=String.valueOf(1.0000111);
 		System.out.println(sss1+", "+sss2);
 		*/
		
 		//public static String valueOf(Object obj)成员方法，将类类型转化为字符串类型
 		/*Integer a=new Integer(111111);
 		Double b=new Double(8.888888);
 		String sa=String.valueOf(a);
 		String sb=String.valueOf(b);
 		System.out.println(sa+", "+sb);
 		*/
		
 		//public String toString()成员方法,转化为字符串
 		/*Integer aa=new Integer(123456);
 		System.out.println(aa.toString());
 		*/
		
 		//public String concat(String str)成员方法,字符串拼接,str不为空
 		/*String aaa="1001";         //字符串直接量
 		String aaa1=new String("ppp");    
 		String aab="1002";
 		String aab1=new String("qqq");
 		System.out.println(aaa.concat(aab));
 		System.out.println(aaa1.concat(aab1));
 		System.out.println(aaa1.concat(aab));
 		*/
		
 		//public String replace(char oldChar, char newChar)成员方法,字符串的字符替换
 		/*String ssa="123abc";
 		String ssb=new String("123abc");
 		System.out.println(ssa.replace('1', '0'));  //将字符1换为字符0
 		System.out.println(ssb.replace('a', 'z'));  //将字符a换为字符z
 		*/
		
 		//public String toLowerCase()成员方法,转换为小写字符
 		/*String cc="123abcABC";
 		String cc1=new String("123abcABC");
 		System.out.println(cc.toLowerCase());
 		System.out.println(cc1.toLowerCase());
 		*/
		
 		//public String toUpperCase()成员方法,转换为大写字符
 	  /*String cc2="123abcABC";
 		String cc3=new String("123abcABC");
 		System.out.println(cc2.toUpperCase());
 		System.out.println(cc3.toUpperCase());
 		*/
		
 		//public String trim()成员方法,去除首尾空白符
 	  /*String ccc="   11aa11   ";
 		String ccc1=new String("    111   aaa   111   ");
 		System.out.println(ccc.trim());
 		System.out.println(ccc1.trim());
 		*/
		
 		/*public String substring(int beginIndex)成员方法,
 		 	返回字串，从beginIndex+1到末尾的字串*/
 	  /*String cca="abcdef123456";
 		String ccb=new String("abcdef123456");
 		System.out.println(cca.substring(0)+", "+cca.substring(3));
 		System.out.println(cca.substring(cca.length())+"*");
 		System.out.println(ccb.substring(0)+", "+cca.substring(5));
 		System.out.println(ccb.substring(ccb.length())+"*");
 		*/
		
 		/*public String substring(int beginIndex, int endIndex)成员方法,
		 	返回字串，从beginIndex+1到endIndex的字串*/
 	  /*String cccc="abcdef123456";
 		String cccc1=new String("abcdef123456");
 		System.out.println(cccc.substring(0,cccc.length())+", "+cca.substring(3,6));
 		System.out.println(cccc.substring(3,3)+"*");
 		System.out.println(cccc1.substring(0,cccc1.length())+
 											", "+cccc1.substring(5,7));
 		System.out.println(cccc1.substring(4,4)+"*");
 		*/
 		
		
		////String类格式字符串中的变换类型
		
		
		
		////获取字符串属性的方法
		
		//public int length() 返回字符串长度
		/*String s="123456abc";
		String ss=new String("987654321*&^%$#@");
		System.out.println(s.length()+"\n"+ss.length()+"\n");*/
		
		//public boolean isEmpty(),判断是否为空字符串
		/*String s1="123456abc";             //非空字符串返回false
		String ss1=new String("");        //空字符串返回true
		System.out.println(s1.isEmpty()+"\n"+ss1.isEmpty()+"\n");*/
		
		//public char charAt(int index),返回字符序列第(index+1)个字符
		/*String s2="123456abc";
		String ss2=new String("987654321*&^%$#@");
		System.out.println(s2.charAt(0)+", "+s2.charAt(4)+", "
							+s2.charAt(s2.length()-1));
		System.out.println(ss2.charAt(0)+", "+ss2.charAt(4)+", "
							+ss2.charAt(ss2.length()-1));
		System.out.println("ppplll000***".charAt(0)+", "+"@#$%^&*".charAt(4)+", "
				+"kpl".charAt(2));*/
		
		//public int indexOf(int ch),返回 ch 在字符序列出现的最小下标值
		/*String s3="123456abc";
		String ss3=new String("987654320*&^%$#@");
		System.out.println(s3.indexOf('1')+", "+s3.indexOf('c')+", "
							+s3.indexOf('p'));
		System.out.println(ss3.indexOf('0')+", "+ss3.indexOf(4)+", "
							+ss3.indexOf(1));
		System.out.println("ppplll000***".indexOf('p')+", "+
							"ppplll000***".indexOf('l')+", "+"kpl".indexOf(2));*/

		/*public int indexOf(int ch, int fromIndex),返回 ch 在字符序列出现
		 	不小于fromIndex的最小下标值*/
		/*String s4="123456123abc";
		String ss4=new String("989854980000");
		System.out.println(s4.indexOf('1',5)+", "+s4.indexOf('2',0)+", "
							+s4.indexOf('3',8));
		System.out.println(ss4.indexOf('9',0)+", "+ss4.indexOf('9',6)+", "
							+ss4.indexOf('0',10));
		System.out.println("ppplll000***".indexOf('p',0)+", "+
							"ppplll000***".indexOf('l',8)+", "+"kpl".indexOf('k',2));
		 */
		/*public int indexOf(String str,int fromIndex),返回 str 在字符序列出现
	 			 不小于fromIndex的最小下标值 */
		/*String s5="123456123abc123";
		String ss5=new String("98985498009854");
		System.out.println(s5.indexOf("123",0)+", "+s5.indexOf("123",2)+", "
							+s5.indexOf("abc",8));
		System.out.println(ss5.indexOf("98",0)+", "+ss5.indexOf("98",8)+", "
				+ss5.indexOf("00",10));*/
		
		//public int lastIndexOf(int ch/str),返回 ch(str)在字符序列出现的最大索引下标值
		/*String s6="123456123abc123";
		String ss6=new String("98985498009854");
		System.out.println(s6.lastIndexOf('1')+", "+s6.lastIndexOf("123"));
		System.out.println(ss6.lastIndexOf('9')+", "+ss6.lastIndexOf("54"));*/
		
		//public int compareTo(String str),比较当前字符串和str字符串的大小
		/*String s7="123456123abc123";
		String s8="9123456123abc123";
		String ss7=new String("98985498009854");
		String ss8=new String("  989854");
		System.out.println(s7.compareTo(s8));  //返回Unicode差值
		System.out.println(ss7.compareTo(ss8));*/
		//public int compareToIgnorCase(String str),比较时不区分大小写
		
		//public boolean equals(Object obj);判断当前字符串是否和 obj 相同
		/*String s9="123456123abc123";
		String s99="123456123abc123";
		String ss9="9123456123abc123";
		System.out.println(s9.equals(ss9)+"  "+s9.equals(s99));
		System.out.println((s9==ss9)); */  //注意“==”
		//public boolean equalsIgnoreCase(Object obj);不区分大小写
		
		///将字符串转换为基本数据类型
		//public static boolean parseBoolean(String s),将s解析为布尔类型的数据并返回
		/*System.out.println(Boolean.parseBoolean(null));
		System.out.println(Boolean.parseBoolean("123"));
		System.out.println(Boolean.parseBoolean("true"));*/
		
		/*public static byte parseByte(String s) throws NumberFormatException;
				以十进制形式将s转化为字节类型的数据
		System.out.println(Byte.parseByte("127"));  //注意byte字节的范围 -128~127
		System.out.println(Byte.parseByte("-128"));
		System.out.println(Byte.parseByte("1"));*/
		 
		/*public static short parseShort(String s) throws NumberFormatException;
				以十进制形式将s转化为字节类型的数据
		System.out.println(Short.parseShort("32767"));//注意short字节的范围 -32768~32767
		System.out.println(Short.parseShort("-32768"));
		System.out.println(Float.parseFloat("3.1415926"));
		//short可换为int long float double;注意范围和精度*/
		
		//字符串池,存放字符直接量、通过+连接的字符直接量，和成员方法intern创建的实例对象
		/*String sb=new String("123");
		String sc=new String("123");
		System.out.println("sb"+((sb==sc)? "==" :"!=")+"sc");
		System.out.println("sb"+((sb.intern()==sc.intern())? "==" :"!=")+"sc");*/
		
		
		////StringBuffer字符串缓冲区，包含字符串缓冲区的容量和长度
		
		//public StringBuffer(),创建字符串缓冲区对象
		//public int length(),返回当前字符串缓冲区的长度
		//public int capaccity(),返回当前字符串缓冲区的容量
		/*StringBuffer s=new StringBuffer(); //创建容量16，长度为0的空字符串缓冲区对象
		StringBuffer ss=new StringBuffer(12);//创建容量12，长度为0的空字符串缓冲区对象
		StringBuffer sss=new StringBuffer("123");  //容量19长度3的“123”字符串
		System.out.println(s.capacity()+", "+ss.capacity()+", "+sss.capacity());
		System.out.println(s.length()+", "+ss.length()+", "+sss.length());
		System.out.println(s+", "+ss+", "+sss);*/
		
		//public void ensureCapacity(int mini),设置当前字符串缓冲区的容量,
		//从mini和(当前的容量*2+2)取较大的,
		/*StringBuffer s1=new StringBuffer();       //容量默认16
		StringBuffer ss1=new StringBuffer();      //容量默认16
		s1.ensureCapacity(24);        //设置容量   24<16*2+2
		System.out.println(s1.capacity());
		ss1.ensureCapacity(48);        //设置容量   48<16*2+2
		System.out.println(ss1.capacity());*/
		
		//public void trimToSize(),减少字符串缓冲区的存储空间即容量;
		/*StringBuffer s2=new StringBuffer();       //容量默认16
		StringBuffer ss2=new StringBuffer("123");
		s2.trimToSize();    //s2的容量变为0
		ss2.trimToSize();   //ss2的容量变为3
		System.out.println(s2.capacity()+", "+ss2.capacity());*/
		
		//public void setLength(int newLength),设置字符串缓冲区的长度
		//若 newLength 大于当前的容量，新容量取法与方法 ensureCapacity(int mini) 一样
		/*StringBuffer s3=new StringBuffer("abc");       //长度初始为3
		StringBuffer sa=new StringBuffer("abc00");       //长度初始为5
		StringBuffer ss3=new StringBuffer("123123");   //长度初始为6
		s3.setLength(3);      //设置等于原来长度
		sa.setLength(7);        //设置大于原来长度，后面添加'\u0000',
		ss3.setLength(4);      //设置小于原来长度,损失后面的字符
		System.out.println(s3.length()+", "+sa.length()+", "+ss3.length());
		System.out.println(s3+", "+sa+", "+ss3);*/
		
		//public char charAt(int index),返回字符串的第（index+1）个字符
		//StringBuffer s4=new StringBuffer("abc");
		//System.out.println(s4.charAt(0)+", "+s4.charAt(s4.length()-1));
		
		//public char setCharAt(int index, char ch),
		//	将字符串的第（index+1）个字符设置为 ch
		/*StringBuffer ss4=new StringBuffer("123123");  
		ss4.setCharAt(0, 'k');
		ss4.setCharAt(ss4.length()-1, 'k');
		System.out.println(ss4);*/
		
		//public int indexOf(String str),返回当前字符串第一次出现 str的下标索引
		/*public int indexOf(String str, int fromIndex),
		    	返回当前字符串在 fromIndex后第一次出现 str的下标索引;*/
		//public int lastIndexOf(String str),返回当前字符串最后一次出现 str的下标索引
		/*public int lastIndexOf(String str, int fromIndex),
		   		返回当前字符串在 fromIndex前出现 str的最大下标索引*/
		/*StringBuffer s5=new StringBuffer("abc123abc");       
		StringBuffer sa1=new StringBuffer("abc000abc00abc");       
		StringBuffer ss5=new StringBuffer("123123123123");
		System.out.println(s5.indexOf("abc")+", "+sa1.indexOf("abc", 5)+", "+
						sa1.lastIndexOf("abc")+", "+ss5.lastIndexOf("123",9));*/
		
		///StringBuffer的成员方法进行增、删、改,
		
		//在对应的字符串末尾添加指定数据
		//public StringBuffer append(Object obj),
		//public StringBuffer append(boolean b),
		//public StringBuffer append(char c),  char 可换为  char[] 
		//public StringBuffer append(int i)   int 可换为  long float double
		//public StringBuffer append(String str),
		//public StringBuffer append(StringBuffer sd),
		/*StringBuffer s6=new StringBuffer("123abc");
		char[] c=new char[3];
		c[0]='0';c[1]='0';c[2]='0';
		System.out.println(s6.append(true)+", "+s6.append('0')+", "+
				s6.append(123)+", "+s6.append(3.1415)+"\n"+s6.append(c)+", "+
				s6.append("kkk")+"\n"+s6.append(new StringBuffer("ppp")));*/
		
		/*在对应的字符串下标索引为 offset 处添加指定数据,若插入后新的长度大于旧容量，
				处理方法类似之前的*/
		//public StringBuffer insert(int offset, Object obj),
		//public StringBuffer insert(int offset, boolean b),
		//public StringBuffer insert(int offset, char c),  char 可换为  char[] 
		//public StringBuffer insert(int offset, int i)  int 可换为  long float double
		//public StringBuffer insert(int offset, String str),
		//public StringBuffer insert(int offset, StringBuffer sd),
		/*StringBuffer s7=new StringBuffer("kplkpl");
		char[] c1=new char[3];
		c1[0]='0';c1[1]='0';c1[2]='0';
		System.out.println(s7.insert(1,true)+", "+s7.insert(2,'0')+", "+
				s7.insert(3,123)+", "+s7.insert(4,3.1415)+"\n"+s7.insert(5,c)+", "
				+s7.insert(6,"kkk")+"\n"+s7.insert(7,new StringBuffer("ppp")));*/
		
		/* public StringBuffer delete(int start, int end),
			删除下标从 start 到 end的字符序列,返回操作后的数据 */
		/* public StringBuffer deleteCharAt(int index),
			删除下标为 index 的字符,返回操作后的数据 */
		/*StringBuffer ss7=new StringBuffer("kplkplkplkpl");
		StringBuffer ss77=new StringBuffer("kplkplkplkpl");
		StringBuffer sss7=new StringBuffer("kplkplkplkpl");
		StringBuffer ss777=new StringBuffer("kplkplkplkpl");
		StringBuffer ssa=new StringBuffer("kplkplkplkpl");
		System.out.println(ss7.delete(0, ss7.length())+", "+ss77.delete(2,7));
		System.out.println(sss7.deleteCharAt(0)+", "+ss777.deleteCharAt(5)+", "
				+ssa.deleteCharAt(ssa.length()-1));*/
		
		//public StringBuffer replace(int start, int end, String str)
		//将下标从 start到(end-1)的字符子序列替换为 str
		/*StringBuffer sssa=new StringBuffer("kplkplkplkpl");
		StringBuffer sssb=new StringBuffer("kplkplkplkpl");
		System.out.println(sssa.replace(0,sssa.length(),"lpl"));
		System.out.println(sssb.replace(5,6,"lpl"));*/
		
		//public StringBuffer reverse(),字符串逆序
		//StringBuffer ssb=new StringBuffer("kplkplkplkpl");
		//System.out.println(ssb.reverse());
		
		//public String toString(),将字符串缓冲区转换为字符串
		//StringBuffer ssbb=new StringBuffer("kplkplkplkpl");
		//System.out.println(ssbb.toString());
		
		//public String substring(int start),提取字符序列从 start到末尾
		//public String substring(int start, int end),提取字符序列从 start到 end
		/*StringBuffer ssbb1=new StringBuffer("kplkplkplkpl");
		System.out.println(ssbb1.substring(0));
		System.out.println(ssbb1.substring(0,ssbb1.length())+", "
							+ssbb1.substring(3,6));*/
		
		
		////向量,元素的数据类型必须是引用类型, 包含容量、长度以及容量增量
		//向量变量声明: Vector<向量元素的数据类型> 变量名      Vector<String> vs;
		
		//public Vector(), 创建向量实例对象,默认初始容量10,容量增量0;
		//public Vector(int initial),初始容量initial,容量增量0;
		//public Vector(int initial, int capacity),初始容量initial,容量增量capacity;
		//实例: Vector<String> vs=new Vector<String>();默认初始容量10,容量增量0;
		//实例: Vector<Object> vs=new Vector<Object>();默认初始容量10,容量增量0;
		
		///向量对象的操作, 增、删、改、查
		
		//public boolean add(E o), public void addElement(E obj);
		//功能完全一样,将指定的元素加到向量对象的末尾,长度加 1;
		int initialcapacity=10;
		Vector<Integer> vs=new Vector<Integer>(initialcapacity);
		Vector<String> vo=new Vector<String>(initialcapacity);
		for(int i=0;i<initialcapacity;i++){
			vs.add(i);
			vs.addElement(i*10);
			vo.add("lpl");
			vo.addElement("kpl");
		}
		System.out.println(vs);
		System.out.println(vo);
		
		//public void add(int index, E element), 
		//public void insertElementAt(E obj, int index);功能一样,在 index 处添加新元素
		Vector<String> v=new Vector<String>(10);
		for(int i=0;i<10;i++)
			v.add("123");
		v.add(0,"kpl");
		v.insertElementAt("lpl", 9);
		System.out.println(v);
		
		//public E set(int index, E element),
		//public void setElementAt(E obj, int index),修改第  index 个元素
		Vector<String> v1=new Vector<String>(10);
		for(int i=0;i<10;i++)
			v1.add("123");
		v1.set(0,"kpl");
		v1.setElementAt("lpl", 9);
		System.out.println(v1);
		
		//public void clear(), public void removeAllElements(),清除所有元素,长度为0
		/*public E remove(int index), public void removeElementAt(int index),
				清除下标为index的元素 ,长度减  1  */
		/*public boolean remove(Object o), public void removeElement(Object obj),
		  		清除第一个与参数  o 相等的元素  */
		Vector<String> v2=new Vector<String>(10);
		for(int i=0;i<10;i++){
			v2.add("123");
			v2.addElement("kkk");
		}
		v2.clear();
		System.out.print(v2+", ");
		
		for(int i=0;i<10;i++){
			v2.add("123");
			v2.addElement("kkk");
		}
		v2.removeAllElements();
		System.out.println(v2);
		
		for(int i=0;i<10;i++){
			v2.add("123");
			v2.addElement("kkk");
		}
		v2.remove(0);
		System.out.println(v2);
		v2.removeElementAt(9);
		System.out.println(v2);
		v2.clear();
		
		for(int i=0;i<10;i++){
			v2.add("123");
			v2.addElement("kkk");
		}
		v2.remove("123");
		System.out.println(v2);
		v2.removeElement("kkk");
		System.out.println(v2);
		
		///查询操作
		/*public boolean equals(Object o),判断向量对象是否有与 o相等的,
		   		有就删除第一个与之相等的*/
		/*public boolean contains(Object o),判断指定的对象是否是向量对象的一个元素*/
		//public int indexOf(Object elem),查找第一个与 elem相等的元素，返回下标
		//public int indexOf(Object elem, int index),类似
		//public int lastIndexOf(Object elem),类似
		//public E get(int index),返回下标为 index的元素
		//public E firstElement(),返回下标为0的元素
		//public E lastElement(),返回对象中最后一个元素
		//public int capacity(),获得向量对象的容量
		//public int size(),获得向量对象的长度
		//public boolean isEmpty()判断向量对象是否为空
		Vector<String> vv=new Vector<String>();
		for(int i=0;i<10;i++){
			vv.add("123");
			vv.addElement("kkk");
		}
		System.out.println("向量对象"+vv.isEmpty()+", "+"容量:"+vv.capacity()
				+", "+"长度:"+vv.size());
		System.out.println(vv.get(0)+", "+vv.get(vv.size()-1)+", "+
				vv.indexOf("kkk", 5)+", "+vv.lastElement());
		System.out.println(vv.firstElement()+", "+vv.lastElement());
				
		//通过迭代器遍历
		/*Vector<String> vvv=new Vector<String>();
		for(int i=0;i<10;i++){
			vvv.add("123");
			vvv.addElement("kkk");
		}
		vvv.iterator();
		System.out.println(vvv.iterator());
		while(((Iterator) vvv).hasNext()){
			System.out.println(((Iterator) vvv).next());
		}*/
	}
}

