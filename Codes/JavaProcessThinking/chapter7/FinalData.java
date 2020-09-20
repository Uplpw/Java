/**
 * @notes：final关键字
 * 
 * final关键字与static关键字的使用
 * static 表示只此一份，final 表示是一个常量，不能被修改（相对的，如果是引用变量，则只是引用不能在指向另外一个对象，
 * 原对象的内容还是可以修改的）
 *
 * 此外，final分为静态（编译常量）和非静态（运行常量），如v1、v2
 *
 * 同时，空白final允许在构建器中初始化。
 *
 * 在参数中指定final，则参数只能读，无法修改（匿名内部类使用较多）
 * 
 * private方法隐含是final的，由于其不可被访问，也就无法更改
 */
package com.lpw.chapter7;

import java.util.Random;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 下午5:55:16
 */
class Value {
	int i;

	public Value(int i) {
		this.i = i;
	}
}

public class FinalData {
	private String id;

	public FinalData(String id) {
		this.id = id;
	}

	private static Random rand = new Random(47);
	private final int temp = 10;
	private static final int tempInt = 100;

	private final int v1 = rand.nextInt(20);
	private static final int v2 = rand.nextInt(20);

	// 引用类型
	private final int[] array = { 1, 2, 3 };
	private static final int[] arrayFinal = { 10, 11, 12 };

	private final Value vv = new Value(100);
	private static final Value vv1 = new Value(108);

	public String ArraytoString(int[] array) {
		String s = "";
		for (int i = 0; i < array.length; i++) {
			s = s + array[i] + " ";
		}
		return s;
	}

	public String toString() {
		return id + ": " + id + ", temp: " + temp + ", tempInt: " + tempInt + ", v1: " + this.v1 + ", v2: " + this.v2
				+ ", array: " + this.ArraytoString(this.array) + ", arrayFinal: " + this.ArraytoString(this.arrayFinal)
				+ ", vv: " + vv.i + ", vv1: " + vv1.i;
	}

	public static void main(String[] args) {
		FinalData fd = new FinalData("lpw");
		System.out.println(fd);

		for (int i = 0; i < fd.array.length; i++) {
			fd.array[i]++;
			fd.arrayFinal[i]++;
		}

		System.out.println(fd);

		FinalData t = new FinalData("fd");
		System.out.println(t);
	}
}
