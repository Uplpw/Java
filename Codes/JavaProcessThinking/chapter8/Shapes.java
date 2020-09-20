/**
 * @notes：动态绑定实例（引用为基类类型）
 * 
 * 即使引用是基类类型，但是运行时仍能正确地执行并得到正确结果（开发者想要的结果）
 * 同时引用工厂模式
 */
package com.lpw.chapter8;

import java.util.Random;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月16日 下午4:41:44
 */
class Shape {
	public void draw() {
		System.out.println("Shape is draw");
	};

	public void erase() {
		System.out.println("Shape is erased");
	};
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle is draw");
	};

	public void erase() {
		System.out.println("Circle is erased");
	};
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Triangle is draw");
	};

	public void erase() {
		System.out.println("Triangle is erased");
	};
}

class Square extends Shape {
	public void draw() {
		System.out.println("Square is draw");
	};

	public void erase() {
		System.out.println("Square is erased");
	};
}

/*
 * 工厂模式：工厂类负责创建基类或者子类的对象 本例是通过next方法不断随机产生Shape子类对象
 */
class RandomShapeGenetor {
	private Random rand = new Random();

	// 注意返回类型
	public Shape next() {
		switch (rand.nextInt(3)) {
		case 0:
			return new Circle();
		case 1:
			return new Triangle();
		case 2:
			return new Square();
		default:
			System.out.println("can't find son class");
			return new Shape();
		}
	}
}

public class Shapes {
	// 创建工厂（对象）
	public static RandomShapeGenetor gen = new RandomShapeGenetor();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for (int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		for (Shape shape : s) {
			shape.draw();
		}
	}
}
