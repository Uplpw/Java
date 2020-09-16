/**
 * 
 */
package com.chapter6;

/**
 * @author lpw
 *三级继承：子类对象实例被创建时，即使子类没有构建器，会自动调用其父类的构建器
 *
 */
class A{
	A(int i){
		System.out.println("A is Created "+i);
	}
}

class B extends A{
	B(int i){
		super(i);
		System.out.println("B is Created "+i);
	}
}

public class test3 extends B{
	test3(){
		super(11);
		System.out.println("test3 is Created");
	}
	
	public static void main(String[] args) {
		/*
		 * 想调用含有一个自变量的某个基础类构建器，必须明确地编写对基础类的调用代码。
		 * 这是用 super 关键字以及适当的自变量列表实现
		 */
		test3 t=new test3();
		
	}
}
