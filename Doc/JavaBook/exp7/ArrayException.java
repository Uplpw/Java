
public class ArrayException {
	public static void main(String[] args){
		int[] arrays={1,2,3,4,5};
		//for(int i=0;i<10;i++)
		//	System.out.println(arrays[i]);
		try{
			for(int i=0;i<10;i++){
				System.out.println(arrays[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("数组越界!");
		}
	}
}
