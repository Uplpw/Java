//���: �ַ�����  String ������÷�ʵ��


import java.util.Vector;
public class J_String{
	public static void main(String[] args){
		
		/*//�ַ����ļ��ֱ�ʾ
		String str="123456789";   //�ַ���ֱ����
		String str1="123"+"456"+"789";   //�ַ���ֱ����
		String str2=new String("123456789");   //�����ַ�����
		System.out.println("str"+((str==str1)?"==" : "!=")+"str1");
			//�Ƚ��ַ���ֱ����str��ƴ���ַ�����ֱ����str1
		System.out.println("str"+((str==str2)?"==" : "!=")+"str2");
			//�Ƚ��ַ���ֱ����str�͹����ַ���str2
		*/
		
		/*//�ַ�������ı�ʾ
		String[] s=new String[3];  //�����ַ�������s
		//s[0]="abc";             //�����ַ���ֱ����
		s[0]=new String("abc");      //����String�� ����s[0]
		//s[1]="def";             //�����ַ���ֱ����
		s[1]=new String("def");      //����String�� ����s[1]
		//s[2]="ghi";             //�����ַ���ֱ����
		s[2]=new String("ghi");      //����String�� ����s[2]
		//String s1[]={"123","456","789"};   //�ַ������ʼ��
		String s1[]={new String("123"),new String("456"),new String("789")};
		
		for(int i=0;i<s.length;i++){      //����ַ������� s[]
			System.out.println(s[i]);
			System.out.println(s1[i]);
		}
		*/
		
		/////String��Ĺ��췽��
		
		/*//public String()���췽��
		String s1=new String();   //������ַ����������κ��ַ�
		String s2=null;           //��ָ���κ�һ���ַ�������
		System.out.println(s1+", "+s2);     //���s1,s2�Ľ��
		
		//public String(byte[] bytes)���췽��
		byte b[]={'a','b','c'};  //�����ֽ�����  b[]
		String ss=new String(b);  
 		System.out.println(ss);
 		
 		//public String(char[] value)���췽��
 		char c[]={'1','2','3'};   //�����ַ�����  c[]
 		String ss1=new String(c);   
 		System.out.println(ss1);
 		
 		//public String(String original)���췽��
 		String stt="cdcd";
 		String str=new String(stt);
 		String str1=new String(str);
 		System.out.println(str1);
 		
 		//public String(StringBuffer buffer)���췽��
 		
 		*/
 		
 		/////String��ĳ�Ա����
 		
 		/*public static String valueOf(boolean b)��Ա����,
			��boolean����ת��Ϊ�ַ�������*/
 		/*String s1=String.valueOf(true);        //������boolean����
 		String s2=String.valueOf(false);
 		System.out.println(s1+", "+s2);
 		*/
		
 		//public static String valueOf(char c)��Ա���������ַ���ת��Ϊ�ַ�������
 		/*String s3=String.valueOf('1');
 		String s4=String.valueOf('2');
 		System.out.println(s3+", "+s4);
 		*/
		
 		/*public static String valueOf(int i)��Ա������int �ɻ�Ϊ  long ��
 			������ת��Ϊ�ַ�������*/
 		/*String ss1=String.valueOf(100);
 		String ss2=String.valueOf(200);
 		System.out.println(ss1+", "+ss2);
 		*/
		
 		/*public static String valueOf(float f)��Ա������float �ɻ�Ϊ   double��
 		  	��������ת��Ϊ�ַ�������*/
 		/*String sss1=String.valueOf(3.1415926);
 		String sss2=String.valueOf(1.0000111);
 		System.out.println(sss1+", "+sss2);
 		*/
		
 		//public static String valueOf(Object obj)��Ա��������������ת��Ϊ�ַ�������
 		/*Integer a=new Integer(111111);
 		Double b=new Double(8.888888);
 		String sa=String.valueOf(a);
 		String sb=String.valueOf(b);
 		System.out.println(sa+", "+sb);
 		*/
		
 		//public String toString()��Ա����,ת��Ϊ�ַ���
 		/*Integer aa=new Integer(123456);
 		System.out.println(aa.toString());
 		*/
		
 		//public String concat(String str)��Ա����,�ַ���ƴ��,str��Ϊ��
 		/*String aaa="1001";         //�ַ���ֱ����
 		String aaa1=new String("ppp");    
 		String aab="1002";
 		String aab1=new String("qqq");
 		System.out.println(aaa.concat(aab));
 		System.out.println(aaa1.concat(aab1));
 		System.out.println(aaa1.concat(aab));
 		*/
		
 		//public String replace(char oldChar, char newChar)��Ա����,�ַ������ַ��滻
 		/*String ssa="123abc";
 		String ssb=new String("123abc");
 		System.out.println(ssa.replace('1', '0'));  //���ַ�1��Ϊ�ַ�0
 		System.out.println(ssb.replace('a', 'z'));  //���ַ�a��Ϊ�ַ�z
 		*/
		
 		//public String toLowerCase()��Ա����,ת��ΪСд�ַ�
 		/*String cc="123abcABC";
 		String cc1=new String("123abcABC");
 		System.out.println(cc.toLowerCase());
 		System.out.println(cc1.toLowerCase());
 		*/
		
 		//public String toUpperCase()��Ա����,ת��Ϊ��д�ַ�
 	  /*String cc2="123abcABC";
 		String cc3=new String("123abcABC");
 		System.out.println(cc2.toUpperCase());
 		System.out.println(cc3.toUpperCase());
 		*/
		
 		//public String trim()��Ա����,ȥ����β�հ׷�
 	  /*String ccc="   11aa11   ";
 		String ccc1=new String("    111   aaa   111   ");
 		System.out.println(ccc.trim());
 		System.out.println(ccc1.trim());
 		*/
		
 		/*public String substring(int beginIndex)��Ա����,
 		 	�����ִ�����beginIndex+1��ĩβ���ִ�*/
 	  /*String cca="abcdef123456";
 		String ccb=new String("abcdef123456");
 		System.out.println(cca.substring(0)+", "+cca.substring(3));
 		System.out.println(cca.substring(cca.length())+"*");
 		System.out.println(ccb.substring(0)+", "+cca.substring(5));
 		System.out.println(ccb.substring(ccb.length())+"*");
 		*/
		
 		/*public String substring(int beginIndex, int endIndex)��Ա����,
		 	�����ִ�����beginIndex+1��endIndex���ִ�*/
 	  /*String cccc="abcdef123456";
 		String cccc1=new String("abcdef123456");
 		System.out.println(cccc.substring(0,cccc.length())+", "+cca.substring(3,6));
 		System.out.println(cccc.substring(3,3)+"*");
 		System.out.println(cccc1.substring(0,cccc1.length())+
 											", "+cccc1.substring(5,7));
 		System.out.println(cccc1.substring(4,4)+"*");
 		*/
 		
		
		////String���ʽ�ַ����еı任����
		
		
		
		////��ȡ�ַ������Եķ���
		
		//public int length() �����ַ�������
		/*String s="123456abc";
		String ss=new String("987654321*&^%$#@");
		System.out.println(s.length()+"\n"+ss.length()+"\n");*/
		
		//public boolean isEmpty(),�ж��Ƿ�Ϊ���ַ���
		/*String s1="123456abc";             //�ǿ��ַ�������false
		String ss1=new String("");        //���ַ�������true
		System.out.println(s1.isEmpty()+"\n"+ss1.isEmpty()+"\n");*/
		
		//public char charAt(int index),�����ַ����е�(index+1)���ַ�
		/*String s2="123456abc";
		String ss2=new String("987654321*&^%$#@");
		System.out.println(s2.charAt(0)+", "+s2.charAt(4)+", "
							+s2.charAt(s2.length()-1));
		System.out.println(ss2.charAt(0)+", "+ss2.charAt(4)+", "
							+ss2.charAt(ss2.length()-1));
		System.out.println("ppplll000***".charAt(0)+", "+"@#$%^&*".charAt(4)+", "
				+"kpl".charAt(2));*/
		
		//public int indexOf(int ch),���� ch ���ַ����г��ֵ���С�±�ֵ
		/*String s3="123456abc";
		String ss3=new String("987654320*&^%$#@");
		System.out.println(s3.indexOf('1')+", "+s3.indexOf('c')+", "
							+s3.indexOf('p'));
		System.out.println(ss3.indexOf('0')+", "+ss3.indexOf(4)+", "
							+ss3.indexOf(1));
		System.out.println("ppplll000***".indexOf('p')+", "+
							"ppplll000***".indexOf('l')+", "+"kpl".indexOf(2));*/

		/*public int indexOf(int ch, int fromIndex),���� ch ���ַ����г���
		 	��С��fromIndex����С�±�ֵ*/
		/*String s4="123456123abc";
		String ss4=new String("989854980000");
		System.out.println(s4.indexOf('1',5)+", "+s4.indexOf('2',0)+", "
							+s4.indexOf('3',8));
		System.out.println(ss4.indexOf('9',0)+", "+ss4.indexOf('9',6)+", "
							+ss4.indexOf('0',10));
		System.out.println("ppplll000***".indexOf('p',0)+", "+
							"ppplll000***".indexOf('l',8)+", "+"kpl".indexOf('k',2));
		 */
		/*public int indexOf(String str,int fromIndex),���� str ���ַ����г���
	 			 ��С��fromIndex����С�±�ֵ */
		/*String s5="123456123abc123";
		String ss5=new String("98985498009854");
		System.out.println(s5.indexOf("123",0)+", "+s5.indexOf("123",2)+", "
							+s5.indexOf("abc",8));
		System.out.println(ss5.indexOf("98",0)+", "+ss5.indexOf("98",8)+", "
				+ss5.indexOf("00",10));*/
		
		//public int lastIndexOf(int ch/str),���� ch(str)���ַ����г��ֵ���������±�ֵ
		/*String s6="123456123abc123";
		String ss6=new String("98985498009854");
		System.out.println(s6.lastIndexOf('1')+", "+s6.lastIndexOf("123"));
		System.out.println(ss6.lastIndexOf('9')+", "+ss6.lastIndexOf("54"));*/
		
		//public int compareTo(String str),�Ƚϵ�ǰ�ַ�����str�ַ����Ĵ�С
		/*String s7="123456123abc123";
		String s8="9123456123abc123";
		String ss7=new String("98985498009854");
		String ss8=new String("  989854");
		System.out.println(s7.compareTo(s8));  //����Unicode��ֵ
		System.out.println(ss7.compareTo(ss8));*/
		//public int compareToIgnorCase(String str),�Ƚ�ʱ�����ִ�Сд
		
		//public boolean equals(Object obj);�жϵ�ǰ�ַ����Ƿ�� obj ��ͬ
		/*String s9="123456123abc123";
		String s99="123456123abc123";
		String ss9="9123456123abc123";
		System.out.println(s9.equals(ss9)+"  "+s9.equals(s99));
		System.out.println((s9==ss9)); */  //ע�⡰==��
		//public boolean equalsIgnoreCase(Object obj);�����ִ�Сд
		
		///���ַ���ת��Ϊ������������
		//public static boolean parseBoolean(String s),��s����Ϊ�������͵����ݲ�����
		/*System.out.println(Boolean.parseBoolean(null));
		System.out.println(Boolean.parseBoolean("123"));
		System.out.println(Boolean.parseBoolean("true"));*/
		
		/*public static byte parseByte(String s) throws NumberFormatException;
				��ʮ������ʽ��sת��Ϊ�ֽ����͵�����
		System.out.println(Byte.parseByte("127"));  //ע��byte�ֽڵķ�Χ -128~127
		System.out.println(Byte.parseByte("-128"));
		System.out.println(Byte.parseByte("1"));*/
		 
		/*public static short parseShort(String s) throws NumberFormatException;
				��ʮ������ʽ��sת��Ϊ�ֽ����͵�����
		System.out.println(Short.parseShort("32767"));//ע��short�ֽڵķ�Χ -32768~32767
		System.out.println(Short.parseShort("-32768"));
		System.out.println(Float.parseFloat("3.1415926"));
		//short�ɻ�Ϊint long float double;ע�ⷶΧ�;���*/
		
		//�ַ�����,����ַ�ֱ������ͨ��+���ӵ��ַ�ֱ�������ͳ�Ա����intern������ʵ������
		/*String sb=new String("123");
		String sc=new String("123");
		System.out.println("sb"+((sb==sc)? "==" :"!=")+"sc");
		System.out.println("sb"+((sb.intern()==sc.intern())? "==" :"!=")+"sc");*/
		
		
		////StringBuffer�ַ����������������ַ����������������ͳ���
		
		//public StringBuffer(),�����ַ�������������
		//public int length(),���ص�ǰ�ַ����������ĳ���
		//public int capaccity(),���ص�ǰ�ַ���������������
		/*StringBuffer s=new StringBuffer(); //��������16������Ϊ0�Ŀ��ַ�������������
		StringBuffer ss=new StringBuffer(12);//��������12������Ϊ0�Ŀ��ַ�������������
		StringBuffer sss=new StringBuffer("123");  //����19����3�ġ�123���ַ���
		System.out.println(s.capacity()+", "+ss.capacity()+", "+sss.capacity());
		System.out.println(s.length()+", "+ss.length()+", "+sss.length());
		System.out.println(s+", "+ss+", "+sss);*/
		
		//public void ensureCapacity(int mini),���õ�ǰ�ַ���������������,
		//��mini��(��ǰ������*2+2)ȡ�ϴ��,
		/*StringBuffer s1=new StringBuffer();       //����Ĭ��16
		StringBuffer ss1=new StringBuffer();      //����Ĭ��16
		s1.ensureCapacity(24);        //��������   24<16*2+2
		System.out.println(s1.capacity());
		ss1.ensureCapacity(48);        //��������   48<16*2+2
		System.out.println(ss1.capacity());*/
		
		//public void trimToSize(),�����ַ����������Ĵ洢�ռ伴����;
		/*StringBuffer s2=new StringBuffer();       //����Ĭ��16
		StringBuffer ss2=new StringBuffer("123");
		s2.trimToSize();    //s2��������Ϊ0
		ss2.trimToSize();   //ss2��������Ϊ3
		System.out.println(s2.capacity()+", "+ss2.capacity());*/
		
		//public void setLength(int newLength),�����ַ����������ĳ���
		//�� newLength ���ڵ�ǰ��������������ȡ���뷽�� ensureCapacity(int mini) һ��
		/*StringBuffer s3=new StringBuffer("abc");       //���ȳ�ʼΪ3
		StringBuffer sa=new StringBuffer("abc00");       //���ȳ�ʼΪ5
		StringBuffer ss3=new StringBuffer("123123");   //���ȳ�ʼΪ6
		s3.setLength(3);      //���õ���ԭ������
		sa.setLength(7);        //���ô���ԭ�����ȣ��������'\u0000',
		ss3.setLength(4);      //����С��ԭ������,��ʧ������ַ�
		System.out.println(s3.length()+", "+sa.length()+", "+ss3.length());
		System.out.println(s3+", "+sa+", "+ss3);*/
		
		//public char charAt(int index),�����ַ����ĵڣ�index+1�����ַ�
		//StringBuffer s4=new StringBuffer("abc");
		//System.out.println(s4.charAt(0)+", "+s4.charAt(s4.length()-1));
		
		//public char setCharAt(int index, char ch),
		//	���ַ����ĵڣ�index+1�����ַ�����Ϊ ch
		/*StringBuffer ss4=new StringBuffer("123123");  
		ss4.setCharAt(0, 'k');
		ss4.setCharAt(ss4.length()-1, 'k');
		System.out.println(ss4);*/
		
		//public int indexOf(String str),���ص�ǰ�ַ�����һ�γ��� str���±�����
		/*public int indexOf(String str, int fromIndex),
		    	���ص�ǰ�ַ����� fromIndex���һ�γ��� str���±�����;*/
		//public int lastIndexOf(String str),���ص�ǰ�ַ������һ�γ��� str���±�����
		/*public int lastIndexOf(String str, int fromIndex),
		   		���ص�ǰ�ַ����� fromIndexǰ���� str������±�����*/
		/*StringBuffer s5=new StringBuffer("abc123abc");       
		StringBuffer sa1=new StringBuffer("abc000abc00abc");       
		StringBuffer ss5=new StringBuffer("123123123123");
		System.out.println(s5.indexOf("abc")+", "+sa1.indexOf("abc", 5)+", "+
						sa1.lastIndexOf("abc")+", "+ss5.lastIndexOf("123",9));*/
		
		///StringBuffer�ĳ�Ա������������ɾ����,
		
		//�ڶ�Ӧ���ַ���ĩβ���ָ������
		//public StringBuffer append(Object obj),
		//public StringBuffer append(boolean b),
		//public StringBuffer append(char c),  char �ɻ�Ϊ  char[] 
		//public StringBuffer append(int i)   int �ɻ�Ϊ  long float double
		//public StringBuffer append(String str),
		//public StringBuffer append(StringBuffer sd),
		/*StringBuffer s6=new StringBuffer("123abc");
		char[] c=new char[3];
		c[0]='0';c[1]='0';c[2]='0';
		System.out.println(s6.append(true)+", "+s6.append('0')+", "+
				s6.append(123)+", "+s6.append(3.1415)+"\n"+s6.append(c)+", "+
				s6.append("kkk")+"\n"+s6.append(new StringBuffer("ppp")));*/
		
		/*�ڶ�Ӧ���ַ����±�����Ϊ offset �����ָ������,��������µĳ��ȴ��ھ�������
				����������֮ǰ��*/
		//public StringBuffer insert(int offset, Object obj),
		//public StringBuffer insert(int offset, boolean b),
		//public StringBuffer insert(int offset, char c),  char �ɻ�Ϊ  char[] 
		//public StringBuffer insert(int offset, int i)  int �ɻ�Ϊ  long float double
		//public StringBuffer insert(int offset, String str),
		//public StringBuffer insert(int offset, StringBuffer sd),
		/*StringBuffer s7=new StringBuffer("kplkpl");
		char[] c1=new char[3];
		c1[0]='0';c1[1]='0';c1[2]='0';
		System.out.println(s7.insert(1,true)+", "+s7.insert(2,'0')+", "+
				s7.insert(3,123)+", "+s7.insert(4,3.1415)+"\n"+s7.insert(5,c)+", "
				+s7.insert(6,"kkk")+"\n"+s7.insert(7,new StringBuffer("ppp")));*/
		
		/* public StringBuffer delete(int start, int end),
			ɾ���±�� start �� end���ַ�����,���ز���������� */
		/* public StringBuffer deleteCharAt(int index),
			ɾ���±�Ϊ index ���ַ�,���ز���������� */
		/*StringBuffer ss7=new StringBuffer("kplkplkplkpl");
		StringBuffer ss77=new StringBuffer("kplkplkplkpl");
		StringBuffer sss7=new StringBuffer("kplkplkplkpl");
		StringBuffer ss777=new StringBuffer("kplkplkplkpl");
		StringBuffer ssa=new StringBuffer("kplkplkplkpl");
		System.out.println(ss7.delete(0, ss7.length())+", "+ss77.delete(2,7));
		System.out.println(sss7.deleteCharAt(0)+", "+ss777.deleteCharAt(5)+", "
				+ssa.deleteCharAt(ssa.length()-1));*/
		
		//public StringBuffer replace(int start, int end, String str)
		//���±�� start��(end-1)���ַ��������滻Ϊ str
		/*StringBuffer sssa=new StringBuffer("kplkplkplkpl");
		StringBuffer sssb=new StringBuffer("kplkplkplkpl");
		System.out.println(sssa.replace(0,sssa.length(),"lpl"));
		System.out.println(sssb.replace(5,6,"lpl"));*/
		
		//public StringBuffer reverse(),�ַ�������
		//StringBuffer ssb=new StringBuffer("kplkplkplkpl");
		//System.out.println(ssb.reverse());
		
		//public String toString(),���ַ���������ת��Ϊ�ַ���
		//StringBuffer ssbb=new StringBuffer("kplkplkplkpl");
		//System.out.println(ssbb.toString());
		
		//public String substring(int start),��ȡ�ַ����д� start��ĩβ
		//public String substring(int start, int end),��ȡ�ַ����д� start�� end
		/*StringBuffer ssbb1=new StringBuffer("kplkplkplkpl");
		System.out.println(ssbb1.substring(0));
		System.out.println(ssbb1.substring(0,ssbb1.length())+", "
							+ssbb1.substring(3,6));*/
		
		
		////����,Ԫ�ص��������ͱ�������������, ���������������Լ���������
		//������������: Vector<����Ԫ�ص���������> ������      Vector<String> vs;
		
		//public Vector(), ��������ʵ������,Ĭ�ϳ�ʼ����10,��������0;
		//public Vector(int initial),��ʼ����initial,��������0;
		//public Vector(int initial, int capacity),��ʼ����initial,��������capacity;
		//ʵ��: Vector<String> vs=new Vector<String>();Ĭ�ϳ�ʼ����10,��������0;
		//ʵ��: Vector<Object> vs=new Vector<Object>();Ĭ�ϳ�ʼ����10,��������0;
		
		///��������Ĳ���, ����ɾ���ġ���
		
		//public boolean add(E o), public void addElement(E obj);
		//������ȫһ��,��ָ����Ԫ�ؼӵ����������ĩβ,���ȼ� 1;
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
		//public void insertElementAt(E obj, int index);����һ��,�� index �������Ԫ��
		Vector<String> v=new Vector<String>(10);
		for(int i=0;i<10;i++)
			v.add("123");
		v.add(0,"kpl");
		v.insertElementAt("lpl", 9);
		System.out.println(v);
		
		//public E set(int index, E element),
		//public void setElementAt(E obj, int index),�޸ĵ�  index ��Ԫ��
		Vector<String> v1=new Vector<String>(10);
		for(int i=0;i<10;i++)
			v1.add("123");
		v1.set(0,"kpl");
		v1.setElementAt("lpl", 9);
		System.out.println(v1);
		
		//public void clear(), public void removeAllElements(),�������Ԫ��,����Ϊ0
		/*public E remove(int index), public void removeElementAt(int index),
				����±�Ϊindex��Ԫ�� ,���ȼ�  1  */
		/*public boolean remove(Object o), public void removeElement(Object obj),
		  		�����һ�������  o ��ȵ�Ԫ��  */
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
		
		///��ѯ����
		/*public boolean equals(Object o),�ж����������Ƿ����� o��ȵ�,
		   		�о�ɾ����һ����֮��ȵ�*/
		/*public boolean contains(Object o),�ж�ָ���Ķ����Ƿ������������һ��Ԫ��*/
		//public int indexOf(Object elem),���ҵ�һ���� elem��ȵ�Ԫ�أ������±�
		//public int indexOf(Object elem, int index),����
		//public int lastIndexOf(Object elem),����
		//public E get(int index),�����±�Ϊ index��Ԫ��
		//public E firstElement(),�����±�Ϊ0��Ԫ��
		//public E lastElement(),���ض��������һ��Ԫ��
		//public int capacity(),����������������
		//public int size(),�����������ĳ���
		//public boolean isEmpty()�ж����������Ƿ�Ϊ��
		Vector<String> vv=new Vector<String>();
		for(int i=0;i<10;i++){
			vv.add("123");
			vv.addElement("kkk");
		}
		System.out.println("��������"+vv.isEmpty()+", "+"����:"+vv.capacity()
				+", "+"����:"+vv.size());
		System.out.println(vv.get(0)+", "+vv.get(vv.size()-1)+", "+
				vv.indexOf("kkk", 5)+", "+vv.lastElement());
		System.out.println(vv.firstElement()+", "+vv.lastElement());
				
		//ͨ������������
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

