//���: ͳ��0~20������ɵĸ���


public class Homework5{
	public static void main(String[] args){
		int[] a=new int[21];
		for(int i=0;i<10000;i++){
			int j=(int)(Math.random()*20+0.5);
			a[j]++;
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+", ");
	}
}
