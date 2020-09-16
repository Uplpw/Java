/**
 * 
 */
package com.chapter6;

/**
 * @author lpw
 * 组合与继承联合使用，注意继承时先初始化父类super
 *
 */
class Plate{
	Plate(int i){
		System.out.println("Plate Constructor");
	}
	
	void f1() {
		System.out.println("f1()");
	}
}
class DinnerPlate extends Plate{
	DinnerPlate(int i){
		super(i);
		System.out.println("DinnerPlate Constructor");
	}
}

class Utensil{
	Utensil(int i){
		System.out.println("Utensil Constructor");
	}
}
class Spoon extends Utensil{
	Spoon(int i){
		super(i);
		System.out.println("Spoon Constructor");
	}
	
	void f2() {
		System.out.println("f2()");
	}
}
class Fork extends Utensil{
	Fork(int i){
		super(i);
		System.out.println("Fork Constructor");
	}
	
	void f3() {
		System.out.println("f3()");
	}
}
class Knife extends Utensil{
	Knife(int i){
		super(i);
		System.out.println("Knife Constructor");
	}
	
	void f4() {
		System.out.println("f4()");
	}
}
class Custom{
	Custom(int i){
		System.out.println("Custom Constructor");
	}
	
	void f5() {
		System.out.println("f5()");
	}
}
public class test4 extends Custom{
	private Spoon sp;
	private Fork fk;
	private Knife kf;
	private DinnerPlate dp;
	public test4(int i) {
		super(i);
		this.sp=new Spoon(i+1);
		this.fk=new Fork(i+2);
		this.kf=new Knife(i+3);
		this.dp=new DinnerPlate(i+4);
		System.out.println("test4 Constructor");
	}
	
	public void method() {
		/*
		 * 对应的方法可分开进行，相当于自己有这样的行为，实际上是组合的对象发出的
		 */
		this.sp.f2();
		this.fk.f3();
		this.kf.f4();
		this.dp.f1();
		super.f5();
	}
	
	public static void main(String[] args) {
		new test4(10).method();
	}
}
