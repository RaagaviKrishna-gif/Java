package array_program;

public class rotationArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,5,4};
		int count=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[i-1]) {
				count++;
				
			}
		}
			if(a[0]<a[a.length-1])
				count++;
		
		
		if(count<=1) {
			System.out.println("Rotation Array");
		}else
		{
		System.out.println("Not Rotated Array");}
	}

}

/*
 true
 1,2,3,4,5
 2,3,4,5,1
 3,4,5,1,2
 4,5,1,2,3
 5,1,2,3,4
 */
