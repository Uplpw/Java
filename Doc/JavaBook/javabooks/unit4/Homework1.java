//简介: 参数为字符串的方法调用例程


public class Homework1 {
	public static void mb_operate(String x, String y){
		x.concat(y);
		y=x;
	}
	public static void main(String[] args){
		String a="A";
		String b="B";
		mb_operate(a,b);  //基本类型方法调用不会改变原来的值
		System.out.println(a+"."+b);
	}
}
