//简介: 泛型例程第一种,形式定义类型变量的泛型例程


public class J_Add<T> {
	public String mb_sum(T a1, T a2, T a3){
		return (a1.toString()+a2.toString()+a3.toString());
	}
	
	public static void main(String[] args){
		J_Add<Integer> a=new J_Add<Integer>();
		Integer a1=1;
		Integer a2=2;
		Integer a3=3;
		
		J_Add<String> b=new J_Add<String>();
		String a4="1";
		String a5="2";
		String a6="3";
		
		System.out.println(a.mb_sum(a1,a2,a3));
		System.out.println(b.mb_sum(a4,a5,a6));
	}
}
