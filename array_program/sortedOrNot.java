package array_program;

public class sortedOrNot {
	public static void main(String[] args) {
		int a[]= {10,20,30,3,60,50};
		
		System.out.println(sorted(a)?"Sorted Array":"UnSorted Array");
		
	}
	public static boolean sorted(int a[])
	{
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1])
			return false;
		}
		return true;
	}

}
//UnSorted Array
