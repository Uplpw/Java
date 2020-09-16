//简介: 打印0~26随机生成的个数换成相应的字母


import java.util.Arrays;
public class Homework6{
	public static void main(String[] args){
		int[] a=new int[10];
		char[] c={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
					'o','p','q','r','s','t','u','v','w','x','y','z'};
		int k=0;
		for(int i=0;;i++){  //循环
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
			if(k==10) break;  //输出十个数即结束
		}//输出十个不相同的数字,范围是0~26
		Arrays.sort(a);             //排序方法
		for(int i=0;i<a.length;i++){
			System.out.print(c[a[i]]+", ");
		}
	}
}
