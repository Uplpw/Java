/**
 * @notes：Switch语法
 * 
 * 与枚举enum一起使用最好
 */
package com.lpw.chapter4;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月20日 上午9:51:53
 */
public class SwitchExample {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				System.out.println("i==0");
				break;
			case 1:
				System.out.println("i==1");
				break;
			case 2:
				System.out.println("i==2");
				break;
			case 3:
				System.out.println("i==3");
				break;
			case 4:
				System.out.println("i==4");
				break;
			case 5:
				System.out.println("i==5");
				break;
			default:
				System.out.println("iiii");
			}
		}
	}
}
