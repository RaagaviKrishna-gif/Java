package array_program;

public class smallest_Element {
	public static void main(String[] args) {
		int a[]= {88,10,9,8,1,2,3,4,5,6};
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];
			}
			
		}
		System.out.println(small);
	}

}
//1