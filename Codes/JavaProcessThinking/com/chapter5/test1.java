/**
 * 
 */
package com.chapter5;
import com.chapter1.*;
import com.suibi.*;
/**
 * @author lpw 隐藏实施过程（访问修饰符）
 * 
 * 提供“访问器／变化器”方法（亦称为“获取／设置”方法），以便读取和修改值。这是OOP 环境中最 正规的一种方法，也是 Java Beans
 * 的基础
 */

class A{
	private A() {
		System.out.println("create A");
	}
	
	public static A createA() {
		return new A();
	}
	
}
class B extends Test{
	public B() {
		System.out.println("B");
	}
	
	/*
	 * 子类访问其他包父类protected方法
	 */
	void b() {
		foo(10);
	}
}
public class test1 {
	public static void main(String[] args) {
		//调用其他包的类
		test5 e=new test5(1,2,3);
//		e.x; 在其他类中不能访问私有字段，
		e.print();
//		Lpw ll=new Lpw(); 不能访问其他包中的友好类
		
		/*
		 * private 修饰的构建器，则不能被 new
		 */
		A a=A.createA();

		
		
		/*
		 * protected
		 */
		B b=new B();
		b.b();
	}
}
