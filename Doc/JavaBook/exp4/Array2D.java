import java.util.Random;
public class Array2D {
	public static void main(String args[]){
		Random r=new Random();
		int[][] twoD=new int[4][];
		int a1[]=new int[4];
		int a2[]=new int[5];
		int a3[]=new int[6];
		int a4[]=new int[7];
		twoD[0]=a1;
		twoD[1]=a2;
		twoD[2]=a3;
		twoD[3]=a4;
		for(int i=0;i<twoD.length;i++){
			for(int j=0;j<twoD[i].length;j++){
				twoD[i][j]=r.nextInt(10)+1;//生成 (0,10]的随机数
				//twoD[i][j]=Math.abs(r.nextInt()%10);//生成[0,10)的随机数
				System.out.print(twoD[i][j]+" ");
				if(j==twoD[i].length-1) System.out.println();
			}	
		}
		
		int[] oneD;
		int array[]=new int[4];
		twoD[0]=oneD=array;
		for(int i=0;i<array.length;i++){
			array[i]=r.nextInt(100)+1;
			System.out.println(twoD[0][i]+" "+oneD[i]);
		}
	}
}
