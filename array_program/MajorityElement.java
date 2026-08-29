package array_program;

import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		int a[]= {3,3,5,7,5,3,3,3,3,3};
		majority(a);
//		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
//		System.out.println(a[a.length/2]);
		System.out.println(majority(a));
		
	}
	public static int majority(int a[])
	{
		int n=a.length,count=0;
		int majority_element = a[0];
		for(int i=0;i<n;i++){
			if(count==0) {
				majority_element=a[i];
				count++;
			}
			else if(a[i]==majority_element)
				count++;
			else {
				count--;
			}
		}
		return majority_element;
	}
	

}
