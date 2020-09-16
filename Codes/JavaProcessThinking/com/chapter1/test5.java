/**
 * 
 */
package com.chapter1;

/**
 * @author lpw
 *
 */
class Lpw{
	void lpw() {
		System.out.println("lpw");
	}
}

public class test5 {
	private int x;
	private int y;
	private int z;
	public test5(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	//1:第一种创建对象方法，不直接new
	public static test5 create() {
		return new test5(1,2,3);
	}
	
	
	//第二种创建，单例模式，有且仅有一个对象实例
	private static test5 t=new test5(1,2,3);
	public static test5 createOne() {
		return t;
	}
	
	public void print() {
		System.out.println("xyz: "+x+y+z);
	}
	
	public static void main(String[] args) {
		System.out.println(new test5(1,2,3).x);
		
	}
}
