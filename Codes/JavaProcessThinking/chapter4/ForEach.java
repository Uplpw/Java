/**
 * @notes：foreach语法
 * 
 * 更为简洁的for语法用于数组与容器
 */
package com.lpw.chapter4;

import java.util.Random;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月20日 上午9:45:10
 */
public class ForEach {
	public static void main(String[] args) {
		Random rand = new Random(44);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = rand.nextInt(100);
		}
		// foreach格式
		for (int x : a) {
			System.out.println(x);
		}
	}
}
