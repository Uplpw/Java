//简介：异常处理例程


public class J_Exception {
	public static void mb_throwException(){
		System.out.println("产生并抛出ArithmeticException类型的异常");
		throw new ArithmeticException();
	}
	
	public static void mb_catchArrayException(){
		try{
			mb_throwException();
			System.out.println("在try语句块中的多余语句");
		}
		catch(ArrayIndexOutOfBoundsException e){//捕获的异常与参数不一致，不进行catch语句
			System.err.println("方法mb_catchArrayException捕获到异常");
		}
		finally{
			System.out.println("方法mb_catchArrayException的finally语句块");
		}
		System.out.println("方法mb_catchArrayException运行结束");
	}
	
	public static void main(String[] args){
		try{
			mb_catchArrayException();
		}
		catch(ArithmeticException e){
			System.err.println("方法main捕获到异常");
		}
		finally{
			System.out.println("方法main的finally语句块");
		}
		System.out.println("异常处理结束");
	}
}
