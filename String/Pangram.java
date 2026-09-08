package String;

public class Pangram {
	
	public static void main(String[] args) {
		String s="The Quick brown fox jumps over a lazy dog";
		
		System.out.println(s + " : " +(isPangram(s)?"Pangram":"Not Pangram"));
	}
	
	public static boolean isPangram(String s)
	{
		s=s.toUpperCase();
		
		char a[]=s.toCharArray();
		
		boolean b[]=new boolean[26];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				b[a[i]-65]=true;
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(!b[i])
				return false;
		}
		return true;
	}

}
