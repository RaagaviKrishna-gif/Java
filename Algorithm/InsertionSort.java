package Algorithm;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {3,5,1,8,5,1,0,6,4};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			int curr=a[i];
			int prev=i-1;
			
			while(prev>=0 && a[prev]>curr)
			{
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
		}
		System.out.println(Arrays.toString(a));
	}
}
