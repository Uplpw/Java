/**
 * @notes：protected关键字
 * 
 * protected修饰的方法允许导出类以及同包内的类访问（尽量使用private），可以控制导出类的访问权限
 */
package com.lpw.chapter7;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 下午5:38:33
 */
class Villain {
	private String name;

	protected void setName(String nm) {
		this.name = nm;
	}

	public Villain(String name) {
		this.name = name;
	}

	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}

public class Orc extends Villain {
	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name);
		// TODO Auto-generated constructor stub
		this.orcNumber = orcNumber;
	}

	/*
	 * 改变基类字段的值，因为方法setName()是protected
	 */
	public void change(String name, int orcNumber) {
		setName(name);
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "Orc: " + orcNumber + ", " + super.toString();
	}

	public static void main(String[] args) {
		Orc orc = new Orc("LPW", 12);
		System.out.println(orc);
		orc.change("Bob", 22);
		System.out.println(orc);
	}
}
