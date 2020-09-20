/**
 * @notes：接口与工厂
 * 
 * 生成遵循某个接口的对象的典型模式就是工厂方法；工厂对象调用产品方法生成产品对象（创建方法）
 * 
 * 对于创建类，不应该在任何时刻都可以代替为创建一个工厂与接口
 * 
 * 恰当的选择是优先选择类而不是接口，除非是接口的必需性是十分明确的
 */
package com.lpw.chapter9;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月18日 下午4:40:27
 */
interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	/*
	 * 工厂：返回产品的对象方法
	 */
	Service getService();
}

class Implementation1 implements Service {
	Implementation1() {
	}

	public void method1() {
		System.out.println("Implementation1 method1()");
	}

	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method2()");
	}
}

class Implementation2 implements Service {
	Implementation2() {
	}

	public void method1() {
		System.out.println("Implementation2 method1()");
	}

	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation2 method2()");
	}
}

class Implementation1Factory implements ServiceFactory {

	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation1();
	}
}

class Implementation2Factory implements ServiceFactory {

	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation2();
	}
}

public class Factories {
	/*
	 * 接口作为参数，调用工厂方法产生产品对象
	 */
	public static void serviceConsumer(ServiceFactory sf) {
		Service s = sf.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
	}
}
