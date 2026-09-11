package String;

import java.util.Scanner;
public class CyclicPrime2 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		String s=sc.next();
		
		System.out.println(isCyclicprime(s)?"Cyclic Prime":"Not Cyclic Prime");
		
	}
	public static boolean isPrime(int number)
	{
		if(number==0 || number==1)
			return false;
		
		for(int i=2;i<(int)Math.sqrt(number);i++)
		{
			if(number%i==0)
				return false;
		}
		return true;
			
	}
	
	public static boolean isCyclicprime(String s)
	{
		int n=s.length();
		for(int i=1;i<=n;i++)
		{
			char first=s.charAt(0);
			int num=Integer.parseInt(s);
			if(!isPrime(num))
				return false;
			
			s=s.substring(1)+first;
		}
		return true;
	}
}
