package String;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s="Programming";
		System.out.println("Remove Duplicate is : "+isDuplicate(s));
	}
	
	public static String isDuplicate(String s)
	{
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			char data=s.charAt(i);
			if(ans.indexOf(data)==-1)
			{
				ans+=data;
			}
		}
		return ans;
	}
}
