public class Txt_2 {
	public static void main(String args[]){
		TestThread1 t=new TestThread1();
		new Thread(t).start();
		for(int i=0;i<10;i++)
			System.out.println("����������!");
	}
}
class TestThread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("�����쳣!");
		}
	}
}