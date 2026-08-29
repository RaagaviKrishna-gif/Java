package array_program;

import java.util.Arrays;

public class rightRotation {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int k=15;
		rotate(a,k);
		System.out.println(Arrays.toString(a));
	}
	public static void rotate(int a[] ,int k)
	{
		int n=a.length;
		k=k%n;
		reverse(a,0,n-1);
		reverse(a,0,k-1);
		reverse(a,k,n-1);
	}
	public static void reverse(int a[],int left,int right)
	{
		while(left<right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
	}
}

/*
 right rotation
 --------------
 1,2,3,4,5,6,7
 7,1,2,3,4,5,6
 6,7,1,2,3,4,5
 5,6,7,1,2,3,4
 4,5,6,7,1,2,3
 3,4,5,6,7,1,2
 2,3,4,5,6,7,1
 */