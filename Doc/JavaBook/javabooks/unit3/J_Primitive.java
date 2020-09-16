//间接: 基础数据类型值传递过程

public class J_Primitive {
	public static void mb_method(int a){
		System.out.println("在 a++ 之前方法参数 a="+a);
		a++;
		System.out.println("在 a++ 之后方法参数 a="+a);
	}//方法mb_method结束

	public static void main(String[] args){
		int i=0;
		System.out.println("在 方法调用前变量 i="+i);
		mb_method(i);   //或 J_Primitive.mb_method(i)    静态成员方法
		System.out.println("在 方法调用后变量 i="+i);
	}
}
