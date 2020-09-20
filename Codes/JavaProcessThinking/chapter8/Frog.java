/**
 * @notes：构造器与多态、继承与清理
 * 
 * 构造器是不具有多态的，它是隐式的static方法，具体如何初始化或者调用顺序见chapter6->testAll.java
 * 
 * 继承与清理：一般是不需要清理的，由gc（垃圾回收器）进行处理；如果需要清理，需要为类创建dispose()方法
 * 			由于继承，需要在子类中覆盖/重载dispose方法，并且调用基类的dispose方法，否则基类的清理不会方法
 * 
 * 	子类调用dispose清理对象时，首先清理子类，然后才是基类。可能子类会调用基类的方法。故按照创建的逆序清理
 */
package com.lpw.chapter8;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月16日 下午11:10:18
 */
class Characteristic {
	private String s;

	Characteristic(String s) {
		this.s = s;
		System.out.println("Create Characteristic " + s);
	}

	protected void dispose() {
		System.out.println("Disposing Characteristic " + s);
	}
}

class Description {
	private String s;

	Description(String s) {
		this.s = s;
		System.out.println("Create Description " + s);
	}

	protected void dispose() {
		System.out.println("Disposing Description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic(" is alive");
	private Description t = new Description(" Basic Living Creature");

	LivingCreature() {
		System.out.println("LivingCreature");
	}

	protected void dispose() {
		System.out.println("LivingCreature Disposing");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic(" has heart");
	private Description t = new Description(" Animal not Vegetable");

	Animal() {
		System.out.println("Animal()");
	}

	protected void dispose() {
		System.out.println("Animal Disposing");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic(" can live in water");
	private Description t = new Description(" Bother water and land");

	Amphibian() {
		System.out.println("Amphibian()");
	}

	protected void dispose() {
		System.out.println("Amphibian Disposing");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian {
	private Characteristic p = new Characteristic(" Croaks");
	private Description t = new Description(" Eats Bugs");

	public Frog() {
		System.out.println("Frog()");
	}

	protected void dispose() {
		// 逆序清理
		System.out.println("Frog Disposing");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		Frog f = new Frog();
		System.out.println("Bye");
		f.dispose();
	}
}
