/**
 * @notes：接口：抽象类
 * 
 * 抽象类：包含抽象方法的类。其中抽象类的方法不一定全是抽象的。主要提供接口部分
 */
package com.lpw.chapter9;

import com.lpw.chapter8.Note;
import com.lpw.util.MyUtil;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月17日 下午7:07:58
 */
abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		MyUtil.print("Wind.play() " + n);
	}

	public void adjust() {
	}
}

class Brass extends Instrument {
	public void play(Note n) {
		MyUtil.print("Brass.play() " + n);
	}

	public void adjust() {
		System.out.println("Brass.adjust()");
	}
}

class WoodWind extends Wind {
	public void play(Note n) {
		MyUtil.print("WoodWind.play() " + n);
	}

	public String what() {
		return "WoodWind";
	}
}

public class Music4 {
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
