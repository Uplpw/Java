//���: ��ӡ0~26������ɵĸ���������Ӧ����ĸ


import java.util.Arrays;
public class Homework6{
	public static void main(String[] args){
		int[] a=new int[10];
		char[] c={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
					'o','p','q','r','s','t','u','v','w','x','y','z'};
		int k=0;
		for(int i=0;;i++){  //ѭ��
			int j=(int)(Math.random()*26+0.5);
			if(k==0){
				a[k]=j;
				k++;
			}
			else{
				int l;
				for(l=0;l<k;l++)
					if(j==a[l])
						break;
				if(l==k){
					a[k]=j;
					k++;
				}
			}
			if(k==10) break;  //���ʮ����������
		}//���ʮ������ͬ������,��Χ��0~26
		Arrays.sort(a);             //���򷽷�
		for(int i=0;i<a.length;i++){
			System.out.print(c[a[i]]+", ");
		}
	}
}
