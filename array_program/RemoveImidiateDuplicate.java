package array_program;

public class RemoveImidiateDuplicate {
	public static void main(String[] args) {
		int a[]= {0,0,1,1,1,2,2,2,3,3,4};
		System.out.println(removeDuplicate(a));
	}
	public static int removeDuplicate(int a[]) {
		int n=a.length,j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=a[j])
				j++;
			a[j]=a[i];
			
		}
		
		return j+1;
	}

}
