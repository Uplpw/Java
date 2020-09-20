/**
 * @notes：三级继承的基类初始化与带参数的构建器
 * 
 * Java会自动在子类的构建器中插入对基类构建器的调用
 * 
 * 如果构建器带有参数，则需要显式调用基类构建器（super），否则编译报错
 */
package com.lpw.chapter7;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 上午8:38:26
 */
class A {
	A(int i) {
		System.out.println("A is Created " + i);
	}
}

class B extends A {
	B(int i) {
		super(i);
		System.out.println("B is Created " + i);
	}
}

public class Cartoon extends B {
	Cartoon() {
		super(11);
		System.out.println("Cartoon is Created");
	}

	public static void main(String[] args) {
		/*
		 * 想调用含有一个自变量的某个基础类构建器，必须明确地编写对基础类的调用代码。 这是用 super 关键字以及适当的自变量列表实现
		 */
		Cartoon t = new Cartoon();
	}
}
