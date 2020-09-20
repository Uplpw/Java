/**
 * @notes：短路
 * 
 * 短路现象：一旦能准确地判断整个逻辑表达式的值，就不再计算表达式剩余部分，因此表达式后面的部分很可能不会执行
 */
package com.lpw.chapter3;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月20日 上午10:29:56
 */
public class ShortCircuit {
	static boolean test1(int val) {
		System.out.println("test1(" + val + ")");
		System.out.println("result: " + (val < 1));
		return val < 1;
	}

	static boolean test2(int val) {
		System.out.println("test2(" + val + ")");
		System.out.println("result: " + (val < 2));
		return val < 2;
	}

	static boolean test3(int val) {
		System.out.println("test3(" + val + ")");
		System.out.println("result: " + (val < 3));
		return val < 3;
	}

	public static void main(String[] args) {
		// test3(2)没有被执行
		boolean b = test1(0) && test2(2) && test3(2);
		System.out.println("expression: " + b);
	}
}
