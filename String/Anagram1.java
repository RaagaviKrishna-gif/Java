package String;

import java.util.Arrays;

public class Anagram1 {
	public static void main(String[] args) {
		String s1="Earth";
		String s2="hearT";
		
		System.out.println(isAnagram(s1, s2));
	}
	
	public static boolean isAnagram(String s1,String s2)
	{
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		
		if(s1.length()!=s2.length())
			return false;
		
		char []a=s1.toCharArray();
		char []b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);
	}

}
