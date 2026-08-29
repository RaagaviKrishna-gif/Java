package array_program;

public class secondLargest {
	public static void main(String[] args) {
		int a[]= {13,23,34,623,452,764,32,54,342};
		int largest=-1,second=-1;;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				second=largest;
				largest=a[i];
			}
			else if( a[i]>second && a[i]!=largest){
			second=a[i];}
		}
		System.out.println("Second Largest Number is:"+second);
	}
}

//Second Largest Number is:623