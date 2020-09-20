/**
 * @notes：基本类型与引用类型的等价问题
 * 
 * 基本类型的比较使用关系运算符==即可
 * 
 * 引用类型的等价使用==是不行的，引用等价不仅仅需要内容的等价，也需要引用的等价（也就是引用的地址）
 */
package com.lpw.chapter3;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月20日 上午10:01:28
 */

class Value {
	int i;
	/*
	 * 覆盖equals()方法
	 */
//	public boolean equals(Value v) {
//		System.out.println("" + this.i + ", " + v.i);
//		if (this.i == v.i) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}

public class Equivalence {
	public static void main(String[] args) {
		// 使用关系运算符==
		int a = 10, b = 10, c = 11;
		System.out.println("基本类型：");
		System.out.println("a==b: " + (a == b) + ", a==c: " + (a == c));

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(12);
		System.out.println("引用类型：");
		System.out.println("i1==i2: " + (i1 == i2) + ", i1==i3: " + (i1 == i3));
		i1 = i2;
		System.out.println("i1==i2: " + (i1 == i2) + ", i1==i3: " + (i1 == i3));

		// 已有引用类型 比较方法 equal()
		i1 = new Integer(10);
		i2 = new Integer(10);
		i3 = new Integer(12);
		System.out.println("equals() 已有引用类型：");
		System.out.println("i1==i2: " + (i1.equals(i2)) + ", i1==i3: " + (i1.equals(i3)));

		// 自己创建引用 比较方法 equal()
		// 由于equal()比较的是引用，需要在自己创建的类中覆盖equal()方法才可以
		Value v1 = new Value();
		Value v2 = new Value();
		Value v3 = new Value();
		v1.i = v2.i = 10;
		v3.i = 100;
		System.out.println("equals() 自己创建引用类型：");
		System.out.println("v1==v2: " + (v1.equals(v2)) + ", v1==v3: " + (v1.equals(v3)));
	}
}
