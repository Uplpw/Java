import java.util.Scanner;   
class input1 {
	public static void main(String[] args){
		/*Scanner scanner = new Scanner(System.in);
		     �����еģ�������import java.util.Scanner��;
		int i = scanner.nextInt();
		btye b = scanner.nextByte();
		short s = scanner.nextShort();
		long l = scanner.nextLong();
		double d = scanner.nextDouble();
		String str = scanner.next();*/
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("ScannerTest, Please Enter Name:");   
	    String name = sc.nextLine();  //��ȡ�ַ���������   
	    System.out.println("ScannerTest, Please Enter Age:");   
	    int age = sc.nextInt();    //��ȡ��������   
	    System.out.println("ScannerTest, Please Enter Salary:");   
	    float salary = sc.nextFloat(); //��ȡfloat������   
	    System.out.println("Your Information is as below:");   
	    System.out.println("Name:" + name +"\n" + "Age:"+age + "\n"+"Salary:"+salary);
		
		
	    int int_ = sc.nextInt();
	    System.out.println("int_="+int_);
	    byte byte_ = sc.nextByte();
	    System.out.println("byte_="+byte_);
		short short_ = sc.nextShort();
		System.out.println("short_="+short_);
		long long_ = sc.nextLong();
		System.out.println("long_="+long_);
		double double_ = sc.nextDouble();
		System.out.println("double_="+double_);
		String string_ = sc.nextLine();
		System.out.println("string_="+string_);
		sc.close();
	}

}
