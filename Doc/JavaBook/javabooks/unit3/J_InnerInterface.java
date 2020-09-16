//简介: 父类型为接口的匿名内部类例程

interface J_Innerface{
	public static int m_data=100;
	
	public abstract void mb_method();
	//抽象类J_Class结束
}
public class J_InnerInterface {
	public static void main(String[] args){
		J_Innerface b=new J_Innerface(){
			public void mb_method(){
				System.out.println("m_data="+m_data);
			}//方法mb_method结束
		};//实现接口J_Innerface的匿名内部类结束
		b.mb_method();
	}
}
