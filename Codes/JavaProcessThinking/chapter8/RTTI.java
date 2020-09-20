/**
 * @notes：向下转型与运行类型识别
 * 
 * 向上转型会丢失子类的扩展信息（字段、方法），如果想要使用扩展信息需要向下转型（强制类型转换），但是不安全，可能会有异常
 */
package com.lpw.chapter8;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月17日 上午11:02:06
 */
class Useful {
	public void f() {
	};

	public void g() {
	};
}

class MoreUseful extends Useful {
	public void f() {
	};

	public void g() {
	};

	public void u() {
	};

	public void v() {
	};
}

public class RTTI {
	public static void main(String[] args) {
		Useful[] use = { new Useful(), new MoreUseful() };
		use[0].f();
		use[1].g();

		// 向下转型
		((MoreUseful) use[1]).u();
		// 会抛出异常
		// ((MoreUseful)use[0]).u();
	}
}
