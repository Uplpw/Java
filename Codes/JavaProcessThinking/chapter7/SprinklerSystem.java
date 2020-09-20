/**
 * @notes：组合语法
 * 
 * 通过组合多个现有类的对象实现代码复用
 */
package com.lpw.chapter7;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 上午8:28:21
 */
class Water {
	private String s;

	Water() {
		System.out.println("Water()");
		s = new String("Constructed");
	}

	/*
	 * 当编译器需要String，而只有对象时，就会调用toString()方法
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return s;
	}
}

public class SprinklerSystem {
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

	public String toString() {
		return "SprinklerSystem: " + value1 + " " + value2 + " " + value3 + " " + w + " " + i + " " + f;
	}

	public static void main(String[] args) {
		SprinklerSystem t = new SprinklerSystem();
		System.out.println(t);
	}
}
