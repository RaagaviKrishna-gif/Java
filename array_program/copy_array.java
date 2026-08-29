package array_program;

import java.util.*;

public class copy_array {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the Size");
		int size=sc.nextInt();
		
		char []a=new char[size];
		char res[]=new char[size];
		for(int i=0,x=size-1;i<size;i++,x--) {
			System.out.println("Enter a["+i+"]");
			a[i]=sc.next().charAt(0);
			res[x]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(res));
	}
}
