/**
 * @notes: 多态（动态绑定、后期绑定或运行时绑定）
 * 
 * 多态方法允许一种类型表现出与其他相似类之间的区别；将改变的事物以及未改变的事物分离开来
 * 除了final、static方法，其他方法都是动态绑定
 */
package com.lpw.chapter8;

import com.lpw.util.*;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月16日 下午2:59:44
 */
class Instruments {
	public void play(Note n) {
		MyUtil.print("Instrument.play()");
	}
}

class Wind extends Instruments {
	public void play(Note n) {
		MyUtil.print("Wind.play() " + n);
	}
}

public class Music {
	public static void tune(Instruments i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind w = new Wind();
		tune(w);
	}
}
