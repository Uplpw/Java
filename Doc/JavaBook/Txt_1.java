
public class Txt_1 {
	public static void main(String args[]){
		new TestThread().start();
		for(int i=0;i<10;i++)
			System.out.println("����������!");
	}
}
class TestThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("�����쳣!");
		}
	}
}