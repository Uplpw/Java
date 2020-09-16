package exercise;
class A{
	int a=10;
	
	public A f() {
		System.out.println("A");
		return new A();
	}
}

class B extends A{
	
	public B f() {
		System.out.println("B");
		return new B();
	}
}

class C extends B{
	
	public C f() {
		System.out.println("C");
		return new C();
	}
}
public class test {
	public static void main(String[] args) {
		/*String[] str= {"123","12"};
		String[] str1= {"123","12"};
		if(str.equals(str1)) {
			System.out.println(231);
		}
		System.out.println(123);*/
		
		System.out.println("-------------------------");
		A a=new A();
		B b=new B();
		C c=new C();
		
		a.f();
		b.f();
		c.f();
		//ABC
		System.out.println("-------------------------");
		
		a=new B();
		a.f();
		//B
		System.out.println("-------------------------");
		
		a=new C();
		b=new C();
		a.f();
		b.f();
		//CC
	}
}
