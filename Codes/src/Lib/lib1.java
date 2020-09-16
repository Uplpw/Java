/**
 * 
 */
package Lib;

import java.util.LinkedList;

/**
 * @author lpw
 *
 */
public class lib1 {
	//递归实现快排
	public static void Qsort1(int[] a, int start, int end) {
		if(start<end) {
			int i=start;
			int j=end;
			int key=a[start];
			//System.out.println(i+" "+j+" "+key);
			if(start<end) {
				while(i<j) {
					while(i<j && a[j]>=key) {
						j--;
					}
					a[i]=a[j];
					while(i<j && a[i]<=key) {
						i++;
					}
					a[j]=a[i];
				}
				a[i]=key;
				lib1.Qsort1(a, start, i-1);
				lib1.Qsort1(a, i+1, end);
			}
		}
		
	}
	
	public static int partition(int a[], int start, int end) {
		int key=a[start];
		while(start<end) {
			while(start<end && a[end]>=key) {
				end--;
			}
			a[start]=a[end];
			while(start<end && a[start]<=key) {
				start++;
			}
			a[end]=a[start];
		}
		a[start]=key;
		return start;
	}
	
	//非递归快排
	public static void Qsort2(int a[], int start, int end) {
		LinkedList<Integer> link=new LinkedList<Integer>(); //模拟栈
		
		if(start<end) {
			link.push(end);
			link.push(start);
			
			while(!link.isEmpty()) {
				int i=link.pop();
				int j=link.pop();
				int index=partition(a, i ,j);
				if(i<index-1) {
					link.push(index-1);
					link.push(i);
				}
				if(j>index+1) {
					link.push(j);
					link.push(index+1);
				}
			}
		}
	}
	
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a= {3,1,41,2,92,28,322,12,23,122};
		System.out.println(a.length);
		lib1.print(a);
		//递归排序
		lib1.Qsort1(a, 0, a.length-1);
		lib1.print(a);
		
		int[] b= {3,1,41,2,92,28,322,12,23,122};
		//非递归排序
		lib1.Qsort2(b, 0, b.length-1);
		lib1.print(b);
	}
}