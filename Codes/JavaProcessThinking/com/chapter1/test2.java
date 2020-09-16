/**
 * 
 */
package com.chapter1;

/**
 * @author lpw
 * 构建器的使用及扩展
 *
 */
class Example{
	int a;
	String ss;
	
	// 构建器自动 initialize初始化
	//	一旦创建对象，就会分配存储空间，并调用构建器
	//没有构建器则自动创建一个默认构建器
	// 方法过载（重载）为了让相同的方法名伴随不同的自变量类型使用，尽管方法过载是构建器必需的，但亦可应用于其他任何方法
	public Example() {
		System.out.println("create Example of no para");
	}
	
	public Example(int temp) {
		this.a=temp;
		System.out.println("create Example of para is "+temp);
	}
	
	public void info() {
		System.out.println("the method of no para");
	}
	
	public void info(int temp) {
		System.out.println("the method of para is "+temp);
	}
	
	//返回值过载是不被允许的
	//	public int info(int temp) {
	//		System.out.println("the type of retrun is int");
	//		return temp+1;
	//	}
	
	//this 关键字，指向当前对象或者这个对象
	/*
	 * class Banana { void f(int i) {  } }
	 * Banana a = new Banana(), b = new Banana();
	 * a.f(1);
	 * b.f(2);
	 * 相当于
	 * Banana.f(a,1);
	 * Banana.f(b,2);
	 * */
	
	//在多个构建器中，经常在一个构建器中调用另一个构建器；以避免写重复的代码。可用this 关键字
	//	在一个构建器中，若为其赋予一个自变量列表，那么 this 关键字会具有不同的含义：
	//	它会对与那个自变量列表相符的构建器进行明确的调用。这样一来，我们就可通过一条直接的途径来调用其他构建器
	
	public Example(String s, int i) {
		this(i);
		//只能调用一次其他的构建器
		//		this();
		//编译器不让我们从除了一个构建器之外的其他任何方法内部调用一个构建器
		this.ss=s;
	}
	
	void print() {
		System.out.println(this.a+" "+this.ss);
	}
}
public class test2 {
	public static void main(String[] args) {
		//构建器方法重载
		Example e1=new Example();
		Example e2=new Example(1);
//		e1.a=e2.a=100;
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		//一般方法重载
		e1.info();
		e1.info(100);
		Example e3=new Example("lpw", 89);
		e3.print();
		
		Integer i1=new Integer(11);
		Integer i2=new Integer(11);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
		
		for(int i=0;i<100;i++) {
			System.out.print(i+1+" ");
			if (i+1==47) {
				break;
//				return ;
			}
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("\ni="+ i);
			switch(i) {
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
