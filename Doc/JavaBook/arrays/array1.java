import java.util.*;// sort须用
class array1{
	public static void main(String args[]){
		//int score[]; score=new int [10];数组定义
		//int score[]=new int[10];数组定义
		char a1[]={'a','b','c','d','e'};    //数组拷贝
		char a2[]={'z','x','y','t','p','q'};
		System.arraycopy(a1,1,a2,2,4);
		for(int i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
		System.out.println();
		for(int i=0;i<a2.length;i++)
			System.out.print(a2[i]+" ");
		System.out.println();   
		/*System.arraycopy(source,0,dest,0,x); 复制 源数组从下标 0 开始的 X 个元素到
		  目标数组，从目标数组的下标 0 所对应的位置开始。（整型和字符型都OK）*/ 
		
		int a[]={3,1,9,10,7,89,700,17,13};//数组排序
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		int A[][][]={{{5,1},{6,7},{9,4},{8,9}}};
		int sum=0;
		System.out.println(A.length);
		System.out.println(A[0].length);
		System.out.println(A[0][0].length);
		
		for(int i=0;i<A.length;i++)
			for(int j=0;j<A[i].length;j++)
				for(int k=0;k<A[i][j].length;k++)
				{
					System.out.print("A["+i+"]["+j+"]["+k+"]=");
					System.out.println(A[i][j][k]);
					sum+=A[i][j][k];
				}
		System.out.println("sum="+sum);
	}
}
