package array_program;

public class ValidMountain {
	public static void main(String[] args) {
		int a[]= {0,2,3,4,5,2,1,0};
		System.out.println(validmountain(a)?"Valid Mountain":"Not a Valid Mountain");
	}
	public static boolean validmountain(int a[]) {
		int n=a.length,i=0;
		
		
		if(n<3)
			return false;
		
		while( i+1<n && a[i]<a[i+1])
			i++;
		if(i==0 || i==n-1)
			return false;
		
		while(i+1<n && a[i]>a[i+1])
			i++;
		
		return i==n-1;
	}

}
