package String;

public class IsPalindrome {
	
	public static void main(String[] args) {
		String s="Madam";
		System.out.println(s +" is " +(palindrome(s)?"Palindrome":"Not Palindrome"));
		
	}
	
	public static boolean palindrome(String s)
	{
		String res="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		
		return res.equalsIgnoreCase(s);
	}
}
