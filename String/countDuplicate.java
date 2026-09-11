package String;

public class countDuplicate {
	public static void main(String[] args) {
	
		String s="aaabbcccdda";
		char a[]=s.toCharArray();
		
		String ans="";
		int count=1;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else {
				ans+=a[i]+":"+count+"\n";
				count=1;
			}
		}
		ans+=a[a.length-1]+":"+count;
		System.out.println(ans);
	}


}
