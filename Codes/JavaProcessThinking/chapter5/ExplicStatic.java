/**
 * @notes：初始化
 * 
 * 对象创建过程：如名为DOg的类
 * (1)没有显示的使用static，构建器也是静态方法，因此首次创建Dog对象或者Dog类的静态方法/静态域首次被访问时，Java解释器
 * 必须查找类路径，定位Dog.class文件
 * (2)然后载入.class文件（将创建一个Class对象），有关静态初始化的所有动作都被执行。因此静态初始化只在Class对象首次加载时
 * 进行一次
 * (3)当用new Dog()创建对象时，首先会在堆上为Dog对象分配足够的存储空间
 * (4)这块存储空间会被清零，自动将Dog对象中所有基本类型数据设置默认的0
 * (5)执行所有出现在字段定义处的初始化动作
 * (6)执行构建器
 */
package com.lpw.chapter5;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月20日 上午8:57:04
 */
class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
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

public class ExplicStatic {
	public static void main(String[] args) {
		System.out.println("Inside main()");
//		Cups.c1.f(99); //当 c1 未用static修饰时，直接访问报错，可以通过new生成对象访问 c1 如下
		new Cups().c1.f(99);
	}
	// 由于由static main 进入，下面优先被执行
//	static Cups x = new Cups(); // (2)
//	static Cups y = new Cups(); // (2)
}
