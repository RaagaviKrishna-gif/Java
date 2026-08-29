package array_program;

import java.util.Arrays;

public class ProductofArrayExceptItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4};
		int res[]=isProduct(a);
		System.out.println(Arrays.toString(res));

	}
	public static int[] isProduct(int a[])
	{
		
		int n=a.length;
		int left[]=new int[n];
	    left[0]=1;
		for(int i=1;i<n;i++)
		{
			left[i]=a[i-1]*left[i-1];
		}
		
		int right[]=new int[n];
		right[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			right[i]=a[i+1]*right[i+1];
		}
		
		for(int i=0;i<n;i++) {
			a[i]=left[i]*right[i];
		}
		return a;
		
	}

}


//24,12,8,6