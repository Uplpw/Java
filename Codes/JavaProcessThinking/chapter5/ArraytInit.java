/**
 * @notes：数组
 */
package com.lpw.chapter5;

import java.util.Random;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月20日 上午9:09:40
 */
class Array {
	int i;
}

public class ArraytInit {
	static Random rand = new Random();

	static int pRand(int mod) {
		return Math.abs(rand.nextInt()) % mod + 1;
	}

	public static void main(String[] args) {
		int[] a;
		a = new int[pRand(20)];

		prt("length of a = " + a.length);
		for (int i = 0; i < a.length; i++)
			prt("a[" + i + "] = " + a[i]);

		/*
		 * 若操作的是一个非基本类型对象的数组，那么无论如何都要使用new。
		 */
		Integer[] aa = new Integer[pRand(20)];
		prt("length of aa = " + aa.length);
		for (int i = 0; i < aa.length; i++) {
			aa[i] = new Integer(pRand(500));// 初始化，否则会运行错误
			prt("aa[" + i + "] = " + aa[i]);
		}

		// 通过{}初始化非基本类型数组。注意最后一个，
		Integer[] b = new Integer[] { new Integer(1), new Integer(2), new Integer(3), };
		for (int i = 0; i < b.length; i++) {
			prt("b[]=" + b[i]);
		}

		// 可变参数列表，创建对象数组
		f(new Object[] { new Integer(47), new ArraytInit(), new Float(3.14), new Double(11.11) });
		f(new Object[] { "one", "two", "three" });
		f(new Object[] { new Array(), new Array(), new Array() });

		g();
		g(1);
		g(1, 2, 3, 4, 5);
	}

	static void prt(String s) {
		System.out.println(s);
	}

	/*
	 * 可变参数列表实例 (1)由于所有的类型都是继承于Object，所以可以创建Object数组为参数 (2)Object类型之外的可变参数
	 * 
	 * 但可变参数会使得方法重载变得困难，可以加入一个非可变参数解决此问题
	 */
	static void f(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			System.out.println("Object[] " + o[i]);
		}
	}

	// int类型也可以是其他基本类型以及引用类型
	static void g(int... args) {
		System.out.println("static g()");
		System.out.println(args.getClass());
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
