//简介: 异常捕获例程


public class J_ExceptionCatch {
	public static void main(String[] args){
		try{
			System.out.println("try语句块");
			throw new Exception();    //抛出异常，之后的语句不再处理
		}
		catch(Exception e){     //捕获try语句中抛出的异常，并执行catch语句
			System.out.println("catch语句块");
			e.printStackTrace();  //输出异常的类型和异常发生的方法调用堆栈跟踪信息
		}
		finally{    //除非强制退出，不然都会执行finally语句
			System.out.println("finally语句块");
		}
	}
}
