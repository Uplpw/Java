/**
 * @notes：多态缺陷
 * 
 * 覆盖私有方法：
 * 当父类方法为私有，子类同名方法是公有，则会执行父类的私有方法而不是子类的。说明子类无法改写或者重载父类的私有方法
 */
package com.lpw.chapter8;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月16日 下午5:11:32
 */

class Derived extends PrivateOverride {
	public void f() {
		System.out.println("public f()");
	}
}

public class PrivateOverride {
	private void f() {
		System.out.println("private f()");
	}

	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		Derived d = new Derived();

		/*
		 * （1）可由衍生类强制转为基类，与基类引用效果一样
		 * 
		 * （2）不能由基类强制转为衍生类，否则运行错误
		 */
		PrivateOverride po1, po2;
		Derived d1;
		po1 = (PrivateOverride) d; // 加不加强制类型转换皆可
//		po2=new PrivateOverride();
//		d1=(Derived)po2;

		// 注意类型，向上转型会缩小对象的使用方法限制
		po.f();
		d.f();

		po1.f();
//		d1.f();
	}
}
