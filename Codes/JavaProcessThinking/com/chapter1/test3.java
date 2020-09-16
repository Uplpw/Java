/**
 * 
 */
package com.chapter1;

/**
 * @author lpw
 * 静态字段、静态块、静态方法
 *
 */
class Spoon{
	/*
	 * 将其他static 初始化工作划分到类内一个特殊的“static 构建从句”（有时也叫作“静态块”）里
	 * 实际只是一个 static 关键字，后面跟随一个方法主体。与其他 static 初始化一样，
	 * 这段代码仅执行一次——首次生成那个类的一个对象时，或者首次访问属于那个类的一个 static 成员时
	 * （即便从未生成过那个类的对象）
	 */
	static int a=10;
	
	static {
		int i = 47;
		System.out.println("Spoon "+i);
	}
	
	static void print(int temp) {
		System.out.println("static method "+temp);
	}
}

class Cup{
	Cup(int marker) {
		 System.out.println("Cup(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups{
	static Cup c1;
	static Cup c2;
	{
		c1 = new Cup(1);
		c2 = new Cup(2);
	}
	Cups() {
		System.out.println("Cups()");
	}
}
public class test3 {
	public static void main(String[] args) {
		// 静态字段
		/*
		 * 访问静态字段或者静态方法时以及创建对象时，静态块的代码会被优先执行于访问静态字段的代码，并且只被执行一次
		 * 否则静态块的内容永远不会被执行
		 */
//		System.out.println("Spoon " + Spoon.a);
//		Spoon.print(0);
		new Spoon();
		
		//
		System.out.println("Inside main()");
//		Cups.c1.f(99); //当 c1 未用static修饰时，直接访问报错，可以通过new生成对象访问 c1 如下
		new Cups().c1.f(99);
	}
	//由于由static main 进入，下面优先被执行 
//	static Cups x = new Cups(); // (2)
//	static Cups y = new Cups(); // (2)
}
