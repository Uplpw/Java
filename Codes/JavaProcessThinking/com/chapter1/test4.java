/**
 * 
 */
package com.chapter1;

import java.util.*;

/**
 * @author lpw
 * 数组的使用
 *
 */
class Array{
	int i;
}
public class test4 {
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

		// 通过{}初始化非基本类型数组
		Integer[] b = new Integer[] { new Integer(1), new Integer(2), new Integer(3), // 注意最后一个，
		};
		for (int i = 0; i < b.length; i++) {
			prt("b[]=" + b[i]);
		}

		// 创建对象数组
		f(new Object[] { new Integer(47), new test4(), new Float(3.14), new Double(11.11) });
		f(new Object[] { "one", "two", "three" });
		f(new Object[] { new Array(), new Array(), new Array() });
	}

	static void prt(String s) {
		System.out.println(s);
	}
	
	static void f(Object[] o) {
		for (int i=0;i<o.length;i++) {
			System.out.println("Object[] "+o[i]);
		}
	}
}
