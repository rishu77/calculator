package array;
import java.util.Scanner;
public class leftrotation {
public static void main(String[]args ) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int  n=s.nextInt();
	System.out.println("no of rotation");
	int d=s.nextInt();
	
	int a[]=new int[n];
	int i;
	System.out.println("enter an array");
	for(i=0;i<n;i++) {
		
		a[i]=s.nextInt();
		
	}
	System.out.println("original array");
	for(i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}System.out.println("after left rotation");
for(i=0;i<n;i++) {
	System.out.print(a[(i-d+n)%n]+" ");
}
}
}
