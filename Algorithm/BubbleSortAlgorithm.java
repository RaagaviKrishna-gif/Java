
import java.util.Arrays;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		
		int a[]= {8,7,9,3,1};
		
		System.out.println("Before Sorting : " +Arrays.toString(a));
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting : "+Arrays.toString(a));

	}
}


/*
o/p

Before Sorting : [8, 7, 9, 3, 1]
After Sorting : [1, 3, 7, 8, 9]


*/
