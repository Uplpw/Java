//间接: 引用数据类型值传递过程

class J_Time1{
	public int m_month=1;
}


public class J_Reference{
	public static void mb_method(J_Time1 t){
		System.out.println("在t.m_month++之前t.m_month="+t.m_month);
		t.m_month++;
		System.out.println("在t.m_month++之后t.m_month="+t.m_month);
	}
	public static void main(String[] args){
		J_Time1 a=new J_Time1();
		System.out.println("在 方法调用前变量a.m_month="+a.m_month);
		mb_method(a);   //或 J_Primitive.mb_method(i)    静态成员方法
		System.out.println("在 方法调用后变量 a.m_month="+a.m_month);
	}
}
