/**
 * @notes：名称屏蔽
 * 
 * 基类已经有多个被重载的方法名称，在导出类中重新定义该方法名称并不会被屏蔽，导出类以及基类的重载机制仍然有效。
 */
package com.lpw.chapter7;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 下午4:54:30
 */
class Homer {
	/*
	 * 基类中方法doh()被重载
	 */
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}

	int doh(int c) {
		System.out.println("doh(int)");
		return 11;
	}
}

class Milhouse {

}

/*
 * 在导出类中继续重载方法 doh()
 */
class Bart extends Homer {
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}

public class Hide {
	public static void main(String[] args) {
		/*
		 * 注意，此时的引用类型不能换成Homer，由于方法是重载而不是重写，无法实现多态，故无法调用导出类的方法
		 */
		Bart b = new Bart();
		b.doh('x');
		b.doh(100);
		b.doh(new Milhouse());
	}
}
