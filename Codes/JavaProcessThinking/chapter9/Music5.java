/**
 * @notes：接口（interface）
 * 
 * 产生一个完全抽象的类，根本没有提供任何具体实现；允许创建一个被向上转型为多种基类的类型
 * 接口内的方法是默认public的，即使没有public修饰；接口也可以包含域，隐式类型为static & final 
 */
package com.lpw.chapter9;

import com.lpw.chapter8.Note;
import com.lpw.util.MyUtil;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月17日 下午7:26:21
 */
interface IInstrument {
	int i = 5; // static & final

	void play(Note n); // Automatically public

	void adjust();
}

class WWind implements IInstrument {
	public void play(Note n) {
		MyUtil.print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		MyUtil.print(this + ".adjust() ");
	}
}

class BBrass implements IInstrument {
	public void play(Note n) {
		MyUtil.print("Brass.play() " + n);
	}

	public String toString() {
		return "BBrass";
	}

	public void adjust() {
		MyUtil.print(this + ".adjust() ");
	}
}

class WWoodWind extends Wind {
	public void play(Note n) {
		MyUtil.print("WWoodWind.play() " + n);
	}

	public String toString() {
		return "WWoodWind";
	}
}

public class Music5 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] i) {
		for (Instrument e : i) {
			tune(e);
		}
	}

	public static void main(String[] args) {
		Instrument[] i = { new Wind(), new Brass(), new WoodWind() };
		tuneAll(i);
	}
}
