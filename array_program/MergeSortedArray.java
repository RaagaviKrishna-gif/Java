package array_program;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int a[]= {2,2,4,5,6,7};
		int b[]= {1,3,4,7,8,9,10};
		int result[]=merge(a,b);
		System.out.println(Arrays.toString(result));
		
		
	}
	public static int[] merge(int a[],int b[])
	{
		int res[]=new int[a.length+b.length];
		int left=0,right=0,i=0;
		
		while(left<a.length && right<b.length)
		{
			if(a[left]<b[right])
			{
				res[i++]=a[left++];
			}
			else {
				res[i++]=b[right++];
			}
		}
		while(left<a.length)
		{
			res[i++]=a[left++];
		}
		while(right<b.length)
		{
			res[i++]=b[right++];
		}
		return res;
	}

}


//
