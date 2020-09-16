/**
 * 
 */
package Lib;

import java.util.LinkedList;

/**
 * @author lpw
 *
 */
public class lib2 {
	 //(1)递归实现快速排序
	   public static void quickSort(int[]s,int l,int r){
		 
		 if(l<r)
		 {
		 	 int i=l;
		     int j=r;
		     int pivot=s[l]; //取每个子数组的第一个数为基点
		     while(i<j)
		     {
	           while(i<j&&s[j]>pivot) //从右向左
	         	j--;
	           if(j>i)
	           {
	            s[i++]=s[j];    
	           }
	          while(i<j&&s[i]<pivot)   //从左向右
	            i++;
	           if(i<j)
	           {
	         	s[j--]=s[i]; 
	           }
		     }
		     s[i]=pivot;
	         quickSort(s,l,i-1);
	         quickSort(s,i+1,r);   
	         
		 }
	 
	   }
	   //非递归实现快速排序
	 public static void NonRecQuickSort(int[] a,int start,int end) {
	        LinkedList<Integer> stack = new LinkedList<Integer>();  //用栈模拟
	        if(start < end) {
	            stack.push(end);
	            stack.push(start);
	            while(!stack.isEmpty()) {
	                int l = stack.pop();
	                int r = stack.pop();
	                int index = partition(a, l, r);
	                if(l < index - 1) {
	                    stack.push(index-1);
	                    stack.push(l);
	                }
	                if(r > index + 1) {
	                    stack.push(r);
	                    stack.push(index+1);
	                }
	            }
	        }
	    }
	    
	  public static int partition(int[] a, int start, int end) {
	        int pivot = a[start];
	        while(start < end) {
	            while(start < end && a[end] >= pivot)
	                end--;
	            a[start] = a[end];
	            while(start < end && a[start] <= pivot)
	                start++;
	            a[end] = a[start];
	        }
	        a[start] = pivot;
	        return start;
	    }
	   //打印数组的值
	   public static void PrintArray(int[]arr)
	   {
	   	  for(int i=0;i<arr.length;i++)
	   	  {
	   	  	 System.out.print(arr[i]+" ");
	   	  }
	   	   System.out.println();
	 
	   }
	   public static void main(String[]args)
	   {
	       int[]arr={3,62,51,2,5,4,32,8};
	       PrintArray(arr);
	       quickSort(arr,0,arr.length-1);
	       PrintArray(arr);
	       System.out.println();
	       NonRecQuickSort(arr,0,arr.length-1);
	       PrintArray(arr);
	   }

}
