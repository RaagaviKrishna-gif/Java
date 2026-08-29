package array_program;

public class thirdSmallest {
	
	public static void main(String[] args) {
		
		int a[]= {98,7,6,5,4,3};
		int smallest=Integer.MAX_VALUE,second=Integer.MAX_VALUE,third=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				
				third=second;
				second=smallest;
				smallest=a[i];
			}
			else if(a[i]<second && a[i]!=smallest) {
				third=second;
				second=a[i];
			}
			else if(a[i]<third && a[i]!=smallest && a[i]!=second) {
				third=a[i];
			}
		}
		System.out.println("Third Smallest Element is : "+third);
	}

}

//Third Smallest Element is : 5
