//简介: 参数为字符串的方法调用例程


public class Homework2{
	public static void mb_swap(String[] s){
		if(s.length<2)
			return;
		String t=s[0];
		s[0]=s[1];
		s[1]=t;
	}
	
	public static void main(String[] args){
		String[] s={"1","2"};
		mb_swap(s);  //基本类型方法调用不会改变原来的值
		System.out.println(s[0]+s[1]);
	}
}
