package array_program;

import java.util.Arrays;

public class reversr_Array {
	public static void main(String[] args) {
		char a[]= {'H','E','L','L','O'};
		
		int l=0,r=a.length-1;
		while(l<r)
		{
			char temp =a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(a));
	}
}
//[O, L, L, E, H]
