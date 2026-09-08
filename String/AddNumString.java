package String;

public class AddNumString {
	
	public static void main(String[] args) {
		
		String s="ab23c4d1e";
		
		int res=solve(s);
		
		System.out.println("Sum Of The Number is : " +res);

	}
	
	public static int solve(String s)
	{
		char []a=s.toCharArray();
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='0' && a[i]<='9')
			{
				sum+=(a[i]-48);
						
			}
		}
		return sum;
	}
}
