/**
 * @notes：访问权限
 * 
 * 访问权限：public（都可以访问）、包访问权限（类没有任何修饰）、protected（继承访问权限）、private（无法访问，除非自身）
 * 
 * 类中的域与方法：public、protected、private
 * 
 * 类只有三个修饰：public、包访问权限、以及final（不可被修改，无法继承）
 */
package com.lpw.chapter6;

import static com.lpw.util.MyUtil.*;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 下午7:46:18
 */
public class Example {
	public static void main(String[] args) {
		print("Hello");
	}
}
