/**
 * @notes：代理
 * 
 * 代理：组合与继承的中庸之道。
 * 		将成员对象置于新类中（组合），与之同时暴露该成员对象的所以方法（继承），如太空船需要一个控制块
 */
package com.lpw.chapter7;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月19日 上午8:46:51
 */
class SpaceShipControls {
	void up(int velocity) {
		System.out.println("It ups " + velocity);
	}

	void down(int velocity) {
		System.out.println("It downs " + velocity);
	}

	void left(int velocity) {
		System.out.println("It lefts " + velocity);
	}

	void right(int velocity) {
		System.out.println("It rights " + velocity);
	}

	void forward(int velocity) {
		System.out.println("It forwards " + velocity);
	}

	void back(int velocity) {
		System.out.println("It backs " + velocity);
	}
}

public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();

	public SpaceShipDelegation(String name) {
		this.name = name;
	}

	// SpaceShipDelegation method
	public void up(int velocity) {
		controls.up(velocity);
	}

	public void down(int velocity) {
		controls.down(velocity);
	}

	public void left(int velocity) {
		controls.left(velocity);
	}

	public void right(int velocity) {
		controls.right(velocity);
	}

	public void forward(int velocity) {
		controls.forward(velocity);
	}

	public void back(int velocity) {
		controls.back(velocity);
	}

	public static void main(String[] args) {
		SpaceShipDelegation ssd = new SpaceShipDelegation("NESA");
		ssd.up(100);
		ssd.down(10);
	}
}
