//简介：单体类java.lang.Runtime的应用例程


public class J_RuntimeExample {
	public static void main(String args[]){
		Runtime r=Runtime.getRuntime();   //获得唯一对象的引用值
		System.out.println("处理器个数是"+r.availableProcessors());
		try{
			r.exec("cmd /c start dir");
			r.exec("notepad");
		}
		catch(Exception e){
			System.err.println("命令行运行异常！");
			e.printStackTrace();
		}
		System.out.println("可用的最大内存为"+r.maxMemory());
		System.out.println("现在的总内存为"+r.totalMemory());
		System.out.println("现在空闲内存为"+r.freeMemory());
		r.gc();
		System.out.println("现在空闲内存为"+r.freeMemory());
	}
}
