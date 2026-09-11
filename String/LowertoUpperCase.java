package String;

public class LowertoUpperCase {
	
	public static void main(String[] args) {
		String s="AbcdEF$#g";
	
		char a[]=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
				a[i]-=32;
			
			else if(a[i]>='A' && a[i]<='Z')
				a[i]+=32;
		}
		
		System.out.println(s);
		System.out.println(a);
	}
}
