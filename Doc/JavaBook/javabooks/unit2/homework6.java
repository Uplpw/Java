public class homework6{
	public static void main(String[] args){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(i<=4){
					if(j<(-i+5)) System.out.print(" ");
					if(j>=(-i+5) && j<=i+3){
						if(j<i+3) System.out.print("*");
						if(j==i+3) System.out.println("*");
					}
				}
				else{
					if(i>j+3) System.out.print(" ");
					if((i<=j+3) && (-i+11)>=j){
						if((-i+11)>j) System.out.print("*");
						if((-i+11)==j) System.out.println("*");
					}
				}
			}
		}
	}
}
