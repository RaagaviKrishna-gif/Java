package Algorithm;

import java.util.Arrays;

public class CountingSortAlgorithm {
	public static void main(String[] args) {
		int a[]= {2,3,8,7,9,0,3,5,6,1,7};
		System.out.println(Arrays.toString(a));
		countSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int findLargest(int a[]) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			largest=Math.max(largest, a[i]);
		}
		return largest;
	}
	
	public static void countSort(int a[]) {
		int res[]=new int[findLargest(a)+1];
		for(int i=0;i<a.length;i++)
		{
			res[a[i]]++;
		}
		for(int i=0,x=0;i<res.length;i++)
		{
			while(res[i]>0)
			{
				a[x++]=i;
				res[i]--;
			}
		}
	}
}