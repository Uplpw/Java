//简介: 字符串缓冲区例程


public class J_StringBuffer {
	public static void main(String[] args){
		StringBuffer b=new StringBuffer("0123");
		System.out.println("字符串缓冲区的字符序列为\""+b+"\"");
		System.out.println("字符串缓冲区的长度是"+b.length());
		System.out.println("字符串缓冲区的容量是"+b.capacity());
		
		b.ensureCapacity(25);
		System.out.println();
		System.out.println("在调用\"b.ensureCapacity(25)\"之后");
		System.out.println("字符串缓冲区的字符序列为\""+b+"\"");
		System.out.println("字符串缓冲区的长度是"+b.length());
		System.out.println("字符串缓冲区的容量是"+b.capacity());
		//两者 25 和 "当前容量"*2+2
	}
}
