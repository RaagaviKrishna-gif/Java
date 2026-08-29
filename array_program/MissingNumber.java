package array_program;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {9,7,5,3,1,4,6,2,0};
		System.out.println("Missing Number is : "+(isMissing(a)));

	}
	public static int isMissing(int a[])
	{
		int n=a.length;
		int sum=(n*(n+1))/2;
		for(int i=0;i<n;i++)
		{
			sum-=a[i];
		}
		return sum;
	}

}
//Missing Number is : 8
