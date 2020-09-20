/**
 * @notes：多重继承
 * 
 * 通过继承抽象类或者具体类、组合多个接口实现Java的多重继承。（类在前，接口在后）
 * 但是不能继承多个类，只能有一个；但是接口可以有多个，同样可以实现多态的行为
 * 
 * 接口选择：如果创建一个不带任何方法定义与成员变量的基类，应该选择接口
 */
package com.lpw.chapter9;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月18日 下午2:39:32
 */
interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {
		System.out.println(this.getClass() + " ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim() {
		System.out.println(this.getClass() + " swim()");
	}

	/*
	 * 由于ActionCharacter基类已经有了具体的实现，当在该类重写方法时会覆盖原来基类的方法
	 * 同时接口CanFight的fight()方法未定义，所以会因为子类的继承而实现
	 * 
	 * 另一方面也能说明该问题，创建对象所有的定义都要有，即使把下面的fight()注释，也可以创建对象，不会报错；
	 * 说明其定义因为继承基类而实现了fight()方法的定义 (non-Javadoc)
	 * 
	 * @see com.lpw.chapter9.ActionCharacter#fight()
	 */
//	public void fight() {
//		System.out.println(this.getClass()+" Hero.fight()");
//	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lpw.chapter9.CanFly#fly()
	 */
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass() + " fly()");
	}
}

public class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}

	public static void u(CanSwim x) {
		x.swim();
	}

	public static void v(CanFly x) {
		x.fly();
	}

	public static void w(ActionCharacter x) {
		x.fight();
	}

	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
