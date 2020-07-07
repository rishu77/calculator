package array;
import java.util.Scanner;
public class frequency {
public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
	int a[]=new int[n];
	int fr[]=new int [n];
	int i,visited=-1;
	System.out.println("enter an array");
	for(i=0;i<n;i++) {
		a[i]=s.nextInt();
	}System.out.println("enter original array");
	for(i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	for(i=0;i<n;i++) {
		int count=1;
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						count++;
					fr[j]=visited;
					
				}
	}
if(fr[i]!=visited)
fr[i]=count;
	
	}
for(i=0;i<fr.length;i++) {
	if(fr[i]!=visited)
		System.out.println(" "+a[i]+" "+fr[i]);
}
}
}
