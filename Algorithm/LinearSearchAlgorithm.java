package Algorithm;

import java.util.*;
public class LinearSearchAlgorithm {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,4,3,12,6,7,124,64};
		System.out.println("Enter the Element : ");
		int element=sc.nextInt();
		System.out.println(isLinear(a,element));
		

	}
	public static boolean isLinear(int a[] , int element) {
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]==element)
				return true;
		}
		return false;
	}

}

/*  
    Enter the element : 12
     true.
 */