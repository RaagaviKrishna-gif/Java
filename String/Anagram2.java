package String;

public class Anagram2 {
	
	public static void main(String[] args) {
		
		String s1="earth";
		String s2="hearT";
		
		System.out.println(isAnagram(s1, s2)?"Anagram":"Not Anagram");
	}
	
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		int k[]=new int[26];
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{
			k[a[i]-65]++;
			k[b[i]-65]--;
		}
		
		for(int i=0;i<k.length;i++)
		{
			if(k[i] !=0)
			{
				return false;
			}
		}
		
		return true;
	}

}
