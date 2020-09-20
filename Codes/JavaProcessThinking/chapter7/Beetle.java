/**
 * @notes：继承在内的初始化全过程
 * 
 *	对含有main()方法的public类加载时（创建有对象），父类以及父类含有语句块（只有{}，前面没有static）则加载顺序如下：
 * (1)首先按代码顺序，按代码顺序执行父类的静态字段以及静态块({}前有static)，不是静态方法
 * (2)其次按照代码顺序，执行子类的静态字段以及静态块
 * (3)然后指向main()方法体中的。
 * (4)按代码顺序执行父类非静态字段语句
 * (5)执行super()，即父类构建器
 * (6)按代码顺序执行子类的非静态字段语句
 * (7)执行子类的构建器
 * 
 * 	总之：除了静态（static）的，先执行字段语句、初始化变量，再执行构建器
 */
package com.lpw.chapter7;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月17日 上午11:14:49
 */
class Insect {
	private int i = 9;
	private int cc = printInit("cc initialized");
	protected int j;
	{
		int ii = 0;
		System.out.println("i=" + i);
		System.out.println("ii=" + ii);
	}

	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}

	private int ccc = printInit("ccc initialized");
	static {
		System.out.println("static{} before static 字段");
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static {
		System.out.println("static{} after static 字段");
	}

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");

	public Beetle() {
		System.out.println("k=" + k);
		// j 是父类中protected修饰，可以在子类中访问
		System.out.println("j=" + j);
	}

	private static int x2 = printInit("static Beetle.x2 initialized");

	public static void main(String[] args) {
		System.out.println("Beetle Constructed");
		new Beetle();
		System.out.println("-----------");
		new Insect();
	}
}
