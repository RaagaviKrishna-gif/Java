package array_program;

public class secondSmallest {
	public static void main(String[] args) {
		int a[]= {10,9,8,7,6,5,4};
		int smallest=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				second=smallest;
				smallest=a[i];
			}else if(a[i]<second  && a[i]!=smallest) {
				second=a[i];
			}
		}
		System.out.println("Second Smallest Number is : "+second);
	}

}
//Second Smallest Number is : 5