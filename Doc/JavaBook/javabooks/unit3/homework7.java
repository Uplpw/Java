import java.util.Scanner;
public class homework7 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			int s=b*b-4*a*c;
			double t=((double)-b/(2*a));
			
			if(s>=0){
				if(s==0) System.out.println("����������ͬ: "+t);
				else{
					double w=Math.sqrt((double)s);
					System.out.println("һ����"+(t+(-b/w))+"\n"+
										"��һ����"+(t-(-b/w)));
				}
			}
			else{
				s=-s;
				double w=Math.sqrt((double)s);
				if(w/(2*a)>0)
				System.out.println("�÷���û��ʵ���������������"
									+t+"+"+(w/(2*a))+"i, "+t+"-"+(w/(2*a))+"i");
				else
					System.out.println("�÷���û��ʵ���������������"
							+t+"+"+(-w/(2*a))+"i, "+t+"-"+(-w/(2*a))+"i");
			}
		}
		sc.close();
	}
}
