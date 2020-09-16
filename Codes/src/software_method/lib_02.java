package software_method;

class A{
	int a=1;
	int b=2;
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
}

class B extends A{
	int c=10;
	int d=10;
	int a=10;
	int b=10;
	
	/*
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	*/
	public int getC() {
		return this.c;
	}
	
	public int getD() {
		return this.d;
	}
}

public class lib_02 {
	public static void main(String[] args) {
		
		System.out.println("---------------");
		A a=new A();
		System.out.println(a.getA());
		System.out.println(a.getB());
		System.out.println(a.a);
		System.out.println(a.b);
		
		System.out.println("---------------");
		//没有重写方法，故调用的是父类对应槽号的代码
		B b=new B();
		System.out.println(b.getA());
		System.out.println(b.getB());
		System.out.println(b.getC());
		System.out.println(b.getD());
		System.out.println(b.a);
		System.out.println(b.b);
		
		System.out.println("---------------");
		//没有重写方法
		A ab=b;
		System.out.println(ab.getA());
		System.out.println(ab.getB());
		System.out.println(ab.a);
		System.out.println(ab.b);
	}
}
