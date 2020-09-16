/**
 * 
 */
package com.chapter1;

/**
 * @author lpw
 *
 *类继承：动态绑定，只需知道会发生什么
 *抽象类：不能创建对象，否则编译错误
 */
class Shape{
	private String color;

	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void draw() {
		System.out.println("this shape is draw!");
	}
	
	public void erase() {
		System.out.println("this shape is erased!");
	}
	
	public void move() {
		System.out.println("this shape is moving!");
	}
}

class Circle extends Shape{
	
//	public void draw() {
//		System.out.println("this circle shape is draw!");
//	}
//	
//	public void erase() {
//		System.out.println("this circle shape is erased!");
//	}
}
class exampleStatic{
	public static int a=0;
	
	public static void add() {
		a=a+1;
	}
}


class Latter{
	int x;
	
}
public class test1 {
	
	static void modify(Latter a) {
		a.x=100;
	}
	
	void doStuff(Shape s) {
		//只要是形状就请自己采取那个行动，并自己去控制所有的细节吧
		s.draw();
		s.erase();
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Circle c=new Circle();
		new test1().doStuff(c);
		
		System.out.println(exampleStatic.a);
		exampleStatic.add();
		System.out.println(exampleStatic.a);
		
		exampleStatic e=new exampleStatic();
		System.out.println(e.a);
		e.add();
		System.out.println(e.a);
		System.out.println(exampleStatic.a);
		
		
		//别名问题, 解决办法在 12 chapter
		Latter l=new Latter();
		l.x=1;
		test1.modify(l); //传进来的是句柄，指向某个对象
		System.out.println(l.x);
	}

}
