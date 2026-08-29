package array_program;

import java.util.Arrays;

public class zeroToFirst {
	public static void main(String[] args) {
		int a[]= {0,9,8,0,0,6,0,4,0,3,0,1};
	/*	for(int i=0,j=0;i<a.length;i++) {
			if(a[i]==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
//[0, 0, 0, 0, 0, 0, 9, 4, 8, 3, 6, 1]
*/
		
		
		int b[]=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				b[j]=a[i];
				j++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}

//[0, 0, 0, 0, 0, 0, 9, 8, 6, 4, 3, 1]


