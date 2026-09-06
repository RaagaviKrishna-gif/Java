package Algorithm;

import java.util.Arrays;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,7,9,1,-6,4,3,15,2};
		
		System.out.println(Arrays.toString(a));
		
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int s=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[s])
				{
					s=j;
				}
			}
			int temp=a[i];
			a[i]=a[s];
			a[s]=temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
