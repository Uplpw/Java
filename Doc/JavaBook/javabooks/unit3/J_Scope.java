//简介: 同名变量作用域范围重叠情况处理例程

class J_Time{
	public int data=3;
}//类J_Time结束

public class J_Scope extends J_Time{
	public int data=2;
	
	public void mb_method(){
		int data=1;
		System.out.println("data="+data);
		System.out.println("this.data="+this.data);   //该类的成员域
		System.out.println("super.data="+super.data);  //父类的成员域
	}//方法mb_method结束
	
	public static void main(String[] args){
		J_Scope a=new J_Scope();
		a.mb_method();
	}
}
