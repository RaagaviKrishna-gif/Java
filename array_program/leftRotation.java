package array_program;

import java.util.Arrays;

public class leftRotation {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int k=1;
		rotate(a,k);
		System.out.println(Arrays.toString(a));
	}
	public static void rotate(int a[],int k)
	{
		int n=a.length;
		k=k%n;
		reverse(a,k,n-1);
		reverse(a,0,k-1);
		reverse(a,0,n-1);
	}
	public static void reverse(int a[],int left,int right) {
//		int left=0,right=a.length-1;
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
 left rotate
 -----------
 1,2,3,4,5,6,7
 2,3,4,5,6,7,1
 3,4,5,6,7,1,2
 4,5,6,7,1,2,3
 5,6,7,1,2,3,4
 6,7,1,2,3,4,5
 7,1,2,3,4,5,6
 

 */
