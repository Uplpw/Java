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
				if(s==0) System.out.println("方程两解相同: "+t);
				else{
					double w=Math.sqrt((double)s);
					System.out.println("一根："+(t+(-b/w))+"\n"+
										"另一根："+(t-(-b/w)));
				}
			}
			else{
				s=-s;
				double w=Math.sqrt((double)s);
				if(w/(2*a)>0)
				System.out.println("该方程没有实根，有两个虚根："
									+t+"+"+(w/(2*a))+"i, "+t+"-"+(w/(2*a))+"i");
				else
					System.out.println("该方程没有实根，有两个虚根："
							+t+"+"+(-w/(2*a))+"i, "+t+"-"+(-w/(2*a))+"i");
			}
		}
		sc.close();
	}
}
