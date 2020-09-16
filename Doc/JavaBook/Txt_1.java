
public class Txt_1 {
	public static void main(String args[]){
		new TestThread().start();
		for(int i=0;i<10;i++)
			System.out.println("程序在运行!");
	}
}
class TestThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("程序异常!");
		}
	}
}