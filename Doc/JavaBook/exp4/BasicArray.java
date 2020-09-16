
public class BasicArray {
	public static void main(String[] args){
		int[] thisArray,thatArray;
		int[] array1=new int[10];
		for(int i=1;i<=array1.length;i++){
			array1[i-1]=i;
			System.out.print(array1[i-1]+" ");
			if(i%5==0) System.out.println();
		}
		System.out.println();
		
		thisArray=array1;
		for(int i=1;i<=thisArray.length;i++){
			System.out.print(thisArray[i-1]+" ");
			if(i%5==0) System.out.println();
		}
		System.out.println();
		
		int sum=1;
		for(int i=1;i<=thisArray.length;i++){
			sum=sum*thisArray[i-1];
			thisArray[i-1]=sum;
			System.out.println("thisArray["+(i-1)+"]µÄ½×³ËÊÇ:"+thisArray[i-1]);
		}
		System.out.println();
		
		thatArray=thisArray;
		for(int i=1;i<=thatArray.length;i++){
			System.out.print(thatArray[i-1]+" ");
			if(i%5==0) System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=thatArray.length;i++){
			thatArray[4]=55;
			thatArray[9]=100;
			System.out.print(thatArray[i-1]+" ");
			if(i%5==0) System.out.println();
		}
		System.out.println();
		
		int[] array2=new int[20];
		for(int i=1;i<=array2.length;i++){
			array2[i-1]=i*2;
		}
		thatArray=array2;
		for(int i=1;i<=thatArray.length;i++){
			System.out.print(thatArray[i-1]+" ");
			if(i%5==0) System.out.println();
		}
		System.out.println();
	}
}
