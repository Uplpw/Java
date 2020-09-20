/**
 * @notes：接口的继承
 * 
 * 接口是可以继承多个接口，这样可以在接口中添加新的方法声明；还可以通过继承在新接口中组合多个接口
 * 
 * 注意：组合多个接口时，尽量避免所要继承接口同名方法，特别是方法签名以及返回类型不一致，如果是一致可能不会有什么问题
 * 
 * 接口的域：
 * 	类型是隐式的static和final，所以不能是空final，可以被非常量表达式初始化，如下接口RandVals
 * 	同时这些域不是接口的一部分，他们的值被存储在接口的静态存储区域内
 */
package com.lpw.chapter9;

import java.util.Random;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月18日 下午4:01:07
 */
interface RandVals {
	Random rand = new Random(50);
	int RANDOM_INT = rand.nextInt(10);
	long RANDOM_LONG = rand.nextLong() * 10;
	double RANDOM_DOUBLE = rand.nextDouble() * 100;
}

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class Deagon implements DangerousMonster {
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass() + " destroy()");
	}

	public void menace() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass() + " menace()");
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drink();
}

class VeryBadVampire implements Vampire {
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass() + "destroy()");
	}

	public void menace() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass() + " menace()");
	}

	public void kill() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass() + " kill()");
	}

	public void drink() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass() + " drink()");
	}

}

public class HorrorShow {
	static void u(Monster m) {
		m.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static void main(String[] args) {
		DangerousMonster barney = new Deagon();
		u(barney);
		v(barney);
		Vampire vam = new VeryBadVampire();
		u(vam);
		v(vam);
		w(vam);

		/*
		 * 接口域的加载初始化
		 */
		System.out.println(RandVals.RANDOM_INT);
		System.out.println(RandVals.RANDOM_LONG);
		System.out.println(RandVals.RANDOM_DOUBLE);
	}
}
