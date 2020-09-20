/**
 * @notes：构造器内部的多态方法
 *
 *  在构造器调用多态方法，会出现一些问题，要尽可能避免这种情况，即使无法遵循。
 *  
 *   在其他任何事物发生之前，对象的存储空间会被初始化为二进制的0
 */
package com.lpw.chapter8;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月17日 上午10:15:30
 */
class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw(); // 多态调用
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	// 在创建该对象实例之前使用类成员时，其初始值是0，而不是2
	private int id = 2;

	RoundGlyph(int i) {
		id = i;
		System.out.println("RoundGlyph.RoundGlyph(), id: " + id);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(), id: " + id);
	}
}

public class PolyConstructor {
	public static void main(String[] args) {
		System.out.println("start");
		new RoundGlyph(100);
	}
}
/*
 * Glyph() before draw() RoundGlyph.draw(), id: 0 // Glyph() after draw()
 * RoundGlyph.RoundGlyph(), id: 100
 */
