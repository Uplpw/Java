/**
 * 
 */
package com.chapter6;

/**
 * @author lpw
 *
 */

class Lip{
	private String s;
	Lip(){
		s=new String("lip");
	}
	
	public void show() {
		System.out.println("show()");
	}
	public void print() {
		System.out.println("print()");
	}
	
	static void main(String[] args) {
		Lip l=new Lip();
		l.show();
		l.print();
	}
}
public class test2 extends Lip{
	private int i;
	
	test2(){
		this.i=111;
	}
	
	public void tt() {
		System.out.println("i="+i);
	}
	
	public void print() {
		System.out.println("son print()");
		super.print();
	}
	
	public static void main(String[] args) {
		Lip.main(args);
		
		//调用父类
		test2 t=new test2();
		t.tt();
		t.show();
		System.out.println("----------");
		t.print();
	}
}
