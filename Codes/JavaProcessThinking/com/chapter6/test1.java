/**
 * 
 */
package com.chapter6;

/**
 * @author lpw
 *
 */
class Water{
	private String s;
	Water(){
		System.out.println("Water()");
		s=new String("Constructed");
	}
	
	public String toString() {
		return s;
	}
	
	public static void main(String[] args) {
		Water w=new Water();
		System.out.println("w:"+w.toString());
	}
}
public class test1 {
	private String value1, value2, value3;
	Water w;
	int i;
	float f;

	void print() {
		System.out.println("Value1:" + value1);
		System.out.println("Value2:" + value2);
		System.out.println("Value3:" + value3);
		System.out.println("i:" + i);
		System.out.println("f:" + f);
		System.out.println("w:" + w);

	}
	
	public static void main(String[] args) {
		test1 t=new test1();
		t.print();
		
		Water.main(args);
	}
}
