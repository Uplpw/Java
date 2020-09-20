/**
 * @notes：多态缺陷（域与静态方法）
 * 
 * 只有普通方法是可以多态的。域（字段）是在编译期间决定的。
 * 
 * 静态方法：静态方法是直接和类进行关联，而不是对象，故不具有多态性
 */
package com.lpw.chapter8;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月16日 下午10:47:37
 */

class Super {
	public int field = 0;

	public int getField() {
		return field;
	}
}

/*
 * 子类继承父类，当子类创建对象时字段区由两部分组成：父类字段和子类字段
 * （基类字段是private则没有，是不能访问的），一般类的字段都是private的，因此不会发生这类问题
 */
class Sub extends Super {
	public int field = 1;

	public int getField() {
		return field;
	}

	public int getSuperField() {
		return super.field;
	}
}

public class FieldAcess {
	public static void main(String[] args) {
		Super sup = new Sub(); // UpCast
		// 字段不能多态，方法可以多态，一定要记得
		System.out.println("sup.field: " + sup.field + ", sup.getField: " + sup.getField());

		// 子类要使用基类的字段，必须要使用super进行调用
		Sub sub = new Sub();
		System.out.println("sub.field: " + sub.field + ", sub.getField: " + sup.getField() + ", sub.getSuperField： "
				+ sub.getSuperField());
	}
}
