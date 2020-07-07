package array;
import java.util.*;

public class rightrot {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no");
	int n=s.nextInt();
	System.out.println("enter no of rotation");
int n1=s.nextInt();	
	
int a[]=new int[n];
int i,j;	System.out.println("enter an array");
for (i=0;i<n;i++) {
	a[i]=s.nextInt();
	
}System.out.println("original array");
for(i=0;i<n;i++) {
	System.out.print(a[i]+" ");
}System.out.println();

for(i=0;i<n1;i++) {
	int last=a[a.length-1];
	
	for(j=a.length-1;j>0;j--) {
		
	
		a[j]=a[j-1];
	}
	a[0]=last;
	
	
}System.out.println();
System.out.println("right rotation");

for(i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
}
}

