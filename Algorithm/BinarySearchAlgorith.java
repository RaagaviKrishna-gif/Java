
import java.util.*;
public class BinarySearchAlgorith
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Enter the Element : ");
		int element=sc.nextInt();
		System.out.println(isBinary(a,element));
		
	}
	public static boolean isBinary(int a[],int element)
	{
		int l=0,h=a.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(element==a[mid])
			{
				return true;
			}
			else if(element<a[mid])
			{
				h=mid-1;;
			}
			else if(element>a[mid])
			{
				l=mid+1;
			}
		}
		return false;
	}
}


/*
o/p
Enter the Element : 50
true
*/
