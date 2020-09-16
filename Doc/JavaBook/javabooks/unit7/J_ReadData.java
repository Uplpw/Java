//简介：从控制台窗口读入数据的例程


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class J_ReadData {
	public static void mb_printInfo(){
		System.out.println("输入整数还是浮点数?");
		System.out.println("\t0: 退出; 1: 整数; 2: 浮点数");
	}
	
	public static int mb_getInt(BufferedReader f){
		try{
			String s=f.readLine();  //读取一整行数据
			int i=Integer.parseInt(s);//整型类转化为整型
			return i;
		}
		catch(Exception e){
			return -1;
		}
	}
	
	public static double mb_getDouble(BufferedReader f){
		try{
			String s=f.readLine();
			double d=Double.parseDouble(s);
			return d;
		}
		catch(Exception e){
			return 0d;
		}
	}
	
	public static void main(String[] args){
		int i;
		double d;
		try{
			BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
			do{
				mb_printInfo();
				i=mb_getInt(f);
				if(i==0)
					break;
				else if(i==1){
					System.out.print("\t请输入整数: ");
					i=mb_getInt(f);
					System.out.println("\t输入整数: "+i);
				}
				else if(i==2){
					System.out.print("\t请输入浮点数: ");
					d=mb_getDouble(f);
					System.out.println("\t输入浮点数: "+d);
				}
			}
			while(true);
			f.close();
		}
		catch(Exception e){
			System.err.println("发生异常;"+e);
			e.printStackTrace();
		}
	}
}
