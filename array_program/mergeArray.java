package array_program;

import java.util.Arrays;

public class mergeArray {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]= {60,70,80,90,100};
		int res[]=marge(a,b);
		System.out.println(Arrays.toString(res));
	}
	public static int[] marge(int a[],int b[]) {
		int x=0,y=0;
		int res[]=new int[a.length+b.length];
		for(int i=0;i<res.length;i++)
		{
			if(x<a.length)
				res[i]=a[x++];
			else if(y<b.length)
				res[i]=b[y++];
		}
		return res;
	}

}

/*

a-[10, 20, 30, 40, 50]
b-[ 60, 70, 80, 90, 100]
o/p-[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

*/