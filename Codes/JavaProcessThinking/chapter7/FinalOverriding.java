/**
 * @notes：final与private final类
 * 
 * 类中所有的方法都隐式指定为final，由于无法调用private方法，就无法覆盖。
 * 
 * 试图覆盖private方法，也不会报错；因为private方法不是接口的一部分，是隐藏于类中的程序代码，
 * 		在导出类继续生成相同名称的方法，只是生成了一个新的方法，并没有覆盖。
 * 
 * 因此，覆盖只有在方法是基类接口的一部分才会出现。
 * 
 * final类：类前面加入final修饰，则代表不允许继承即没有子类，出于安全的考虑
 */
package com.lpw.chapter7;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 下午7:10:36
 */
class WithFinals {
	// 指定为final修饰
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	// 自动含有final修饰
	private void g() {
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}

	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}

	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverriding {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// follow method isn't call
//		OverridingPrivate op=op2;
//		op.f();
//		op.g();
//		WithFinals wf=op2;
//		wf.f();
//		wf.g();
	}
}
