package com.chapter6;

/**
 * @author lpw
 * 继承：向上转型
 * 另一方面，如果需要向上转型，则需要继承而不是组合
 *
 */
class Intrument{
	Intrument(){
	}
	void play() {
		System.out.println("play()");
	}
	
	public static void tune(Intrument a) {
		a.play();
	}
}
public class test5 extends Intrument{
	public static void main(String[] args) {
		test5 t5=new test5();
		tune(t5);
	}
}
