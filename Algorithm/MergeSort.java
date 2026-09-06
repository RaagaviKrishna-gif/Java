 package Algorithm;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int a[]= {2,7,6,8,0,3,5,9,4};
		divide(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void divide(int a[], int l,int h)
	{
		if(l==h)
			return;
		int mid=(l+h)/2;
		divide(a,l,mid);
		divide(a,mid+1,h);
		merge(a,l,mid,h);
	}
	
	public static void merge(int a[],int l, int mid, int h)
	{
		int k[]=new int[a.length];
		int x=0;
		int left=l,right=mid+1;
		
		while(left<=mid && right<=h)
		{
			if(a[left]<a[right])
			{
				k[x++]=a[left++];
			}
			else
			{
				k[x++]=a[right++];
			}
			
			while(left<=mid)
				k[x++]=a[left++];
			
			while(right<=h)
				k[x++]=a[right++];
			
			x=0;
			for(int i=l;i<=h;i++)
			{
				a[i]=k[x++];
			}
		}
	}
}
