/**
 * @notes：this关键字
 * 
 * 编译器：把所操作的对象当作第一个参数传给方法，而方法的有一个隐藏的参数就是this，即：
 * B b = new B(), b.info()
 * b.info() = b.info(this) = B.info(a) -> this = a,相当于把引用a赋值给了this
 * 
 * static 方法是不存在this的
 * 
 * this一般是在类内部要返回当前对象的引用才使用。一般很少用，除非是不得不用。
 * 
 * 同时通过this也可以在一个构建器中调用另外一个构建器
 * 
 * 
 */
package com.lpw.chapter5;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 下午9:54:45
 */
public class Leaf {
	int i = 0;

	Leaf increase() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i = " + this.i);
	}

	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increase().increase().increase().print();
	}
}
