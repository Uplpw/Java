/**
 * @notes：向上转型
 * 
 * 由导出类向基类转型称为向上转型，但可能会丢失一部分信息，比如在导出类有的字段或者方法而基类没有。
 */
package com.lpw.chapter7;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 下午5:50:13
 */
class Intrument {
	Intrument() {
	}

	void play() {
		System.out.println("play()");
	}

	public static void tune(Intrument a) {
		a.play();
	}
}

public class Wind extends Intrument {
	public static void main(String[] args) {
		Wind w = new Wind();
		tune(w);
	}
}
