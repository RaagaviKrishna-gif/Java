package String;

import java.util.*;

public class CyclicPrime1 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		String s=sc.next();
	
		int number=Integer.parseInt(s);
		
		int temp=number;
		do {
			
			if(number<=1)
			{
				System.out.println("Not Cyclic");
				return;
			}
			for(int i=2;i<(int)Math.sqrt(number);i++)
			{
				if(number%i==0)
				{
					System.out.println("Not Cyclic");
					return;
				}
			}
			s=s.substring(1)+s.charAt(0);
			number=Integer.parseInt(s);
			
		}while(temp!=number);
		System.out.println("Cyclic Prime");
	}

}
