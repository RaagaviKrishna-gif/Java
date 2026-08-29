package array_program;

import java.util.Arrays;

public class zeroToEnd {
	public static void main(String[] args) {
		int a[]= {0,0,4,0,2,5,0,1,3,0,0};
		for(int i=0,j=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
//[4, 2, 5, 1, 3, 0, 0, 0, 0, 0, 0]
