/**
 * @notes：构建器重载
 * 
 * 与其他方法一样，构建器方法也可以重载，可以创建不同的对象
 * 
 * 方法重载是根据方法签名区分的（主要是参数的类型、个数以及顺序），不过不建议用顺序区分，代码难以维护
 * 
 * 重载时，当传入参数类型过大时，必须通过强制类型转换，否则编译报错
 */
package com.lpw.chapter5;

import static com.lpw.util.MyUtil.*;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 下午9:23:46
 */
class Tree {
	int height;

	Tree() {
		print("Planting a seeding");
		this.height = 0;
	}

	Tree(int initHeight) {
		this.height = initHeight;
		print("Creating new tree that is " + height + " meter");
	}

	Tree(double height) {
		this(10);
		// 通过this关键字调用其他构建器，必须在第一行，但只能调用一次
//		this();
		print("Creating new tree that is " + height + " meter");
	}

	void info() {
		print("Tree is " + height + " meter");
	}

	void info(String s) {
		print(s + ": Tree is " + height + " meter");
	}
}

public class Overriding {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}

		double x = 10.3123;
		new Tree((int) x);
		// 重载构建器
		new Tree();
		new Tree(5.5);
	}
}
