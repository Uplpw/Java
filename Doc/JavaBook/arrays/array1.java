import java.util.*;// sort����
class array1{
	public static void main(String args[]){
		//int score[]; score=new int [10];���鶨��
		//int score[]=new int[10];���鶨��
		char a1[]={'a','b','c','d','e'};    //���鿽��
		char a2[]={'z','x','y','t','p','q'};
		System.arraycopy(a1,1,a2,2,4);
		for(int i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
		System.out.println();
		for(int i=0;i<a2.length;i++)
			System.out.print(a2[i]+" ");
		System.out.println();   
		/*System.arraycopy(source,0,dest,0,x); ���� Դ������±� 0 ��ʼ�� X ��Ԫ�ص�
		  Ŀ�����飬��Ŀ��������±� 0 ����Ӧ��λ�ÿ�ʼ�������ͺ��ַ��Ͷ�OK��*/ 
		
		int a[]={3,1,9,10,7,89,700,17,13};//��������
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
