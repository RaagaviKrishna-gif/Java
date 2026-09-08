package String;

import java.util.Scanner;

public class PalindromeOrNot {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter String : ");
		String s1=sc.next();
		
		
		System.out.println(s1 + (isPalindrome(s1)?" Palindrome":" Not Palindrome"));
	}
	
	public static boolean isPalindrome(String s)
	{
		
		
		int l=0,r=s.length()-1;
		while(l<r)
		{
			if(!String.valueOf(s.charAt(l)).equalsIgnoreCase(String.valueOf(s.charAt(r))))
//			if(s.charAt(l)!=s.charAt(r))
				return false;
			
			l++;
			r--;
		}
		return true;
	}
}
