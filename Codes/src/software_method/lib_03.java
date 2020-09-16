package software_method;

class G{
	int a=1;
	
	public void getA() {
		System.out.println(a);  //G
	}
}

class F extends G{
	int a=2;
	           //F
}

public class lib_03 {
	public static void main(String[] args) {
		/*G g=new G();
		g.getA(); //1
		
		F f=new F();
		f.getA();//2
		*/
		G gg=new F();
		gg.getA();//2
		
	}
}
