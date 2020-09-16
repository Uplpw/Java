//简介: 实名内部类例程

class J_Test{
	int m_outer=1;
	static int m_outers=2;
	
	class J_Inner{
		int m_inner;
		static final int m_inners=4;
		
		public J_Inner(){
			m_inner=3;
		}//J_Inner的构造方法结束
		
		public void mb_method(){
			System.out.println("m_outer="+m_outer);
			System.out.println("m_outers="+m_outers);  //调用外部类方法
			System.out.println("m_inner="+m_inner);
			System.out.println("m_inners="+m_inners);   //调用内部类方法
			mb_methodouter();
		}//mb_method方法结束
		
		public void mb_methodouter(){
			System.out.println("m_outer="+m_outer);
		}//mb_methodouter方法结束
	}
}
public class J_InnerTest {
	public static void main(String[] args){
		J_Test a=new J_Test();            //创建外部类对象 a
		J_Test.J_Inner b=a.new J_Inner();   //创建内部类对象 b
		b.mb_method();  //内部类对象调用方法
	}
}
