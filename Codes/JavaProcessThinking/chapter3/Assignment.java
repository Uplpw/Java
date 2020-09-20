/**
 * @notes：赋值操作
 * 
 * 基本类型复制一般是直接赋值，复制的就是某个变量的值，无法改变原来变量指向的值
 * 
 * 引用类型赋值则是复制的某个对象的引用，所以可以通过对象的另外一个引用改变对象的内容
 */
package com.lpw.chapter3;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月20日 上午9:55:25
 */
class Tank {
	int level;
}

class Letter {
	char c;
}

public class Assignment {
	static void f(Letter y) {
		y.c = 'q';
	}

	public static void main(String[] args) {
		/*
		 * 别名问题，直接导致原来t1引用的对象变成了垃圾（无引用指向该对象）， 之后t1与t2同时指向同一个对象，导致一个引用的修改也会影响另外一个引用
		 */
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 49;
		System.out.println("A: \nt1.level: " + t1.level + ", t2.level: " + t2.level);
		// 引用赋值
		t1 = t2;
		System.out.println("B: \nt1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = 40;
		System.out.println("C: \nt1.level: " + t1.level + ", t2.level: " + t2.level);

		/*
		 * 将对象传给方法也会产生别名问题
		 */
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1: x.c=" + x.c);
		f(x);
		System.out.println("2: x.c=" + x.c);
	}
}
