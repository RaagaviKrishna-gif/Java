package array_program;

public class largest_Element {
	public static void main(String[] args) {
		int a[]= {1,7,37,9,45,34,78,24,59,12};
		int largest=a[0];
		for(int i=0;i<a.length;i++ )
		{
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println("Largest Element is :"+largest);
	}

}
//Largest Element is :78