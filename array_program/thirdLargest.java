package array_program;

public class thirdLargest {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int largest=-1,second=-1,third=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				third=second;
				second=largest;
				largest=a[i];
			}
			else if(a[i]>second && a[i]!=largest) {
				third=second;
				second=a[i];
			}
			else if(a[i]>third && a[i]!=largest && a[i]!=second)
				third=a[i];
		}
		System.out.println(third);
	}

}
//3