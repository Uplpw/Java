/**
 * 
 */
package com.chapter6;

/**
 * @author lpw
 * 继承在内的初始化全过程
 * 
 * 对含有main()方法的public类加载时（创建有对象），如果有父类以及父类含有语句块（只有{}，前面没有static）则加载顺序如下：
 * （1）首先按代码顺序，加载父类的静态字段以及静态块({}前有static)
 * （2）其次按照代码顺序，加载子类的静态字段以及静态块
 * （3）然后指向main()方法体。
 * （4）执行super()，即父类构建器
 * （5）执行子类的非静态字段语句
 * （6）执行子类的构建器
 * 
 * 总之：除了静态（static）的，先执行字段语句、初始化变量，再执行构建器
 *
 */
class Insect{
	private int i=9;
	private int cc=printInit("cc initialized");
	protected int j;
	{
		int ii=0;
		System.out.println("i="+i);
		System.out.println("ii="+ii);
	}
	Insect(){
		System.out.println("i = "+i+", j = "+j);
		j=39;
	}
	private int ccc=printInit("ccc initialized");
	private static int x1=printInit("static Insect.x1 initialized");
	
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

public class testAll extends Insect{
	private int k=printInit("testAll.k initialized");
	
	public testAll() {
		System.out.println("k="+k);
		// j 是父类中protected修饰，可以在子类中访问
		System.out.println("j="+j);
	}
	
	private static int x2=printInit("static testAll.x2 initialized");
	
	public static void main(String[] args) {
		System.out.println("testAll Constructed");
		new testAll();
		System.out.println("-----------");
		new Insect();
	}
}

