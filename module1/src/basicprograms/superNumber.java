package basicprograms;
import java.util.Scanner;
public class superNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int n = sc.nextInt();
		int[] ar = new int[n];
		int a=2,count=0,count1=n;
		for(int i=0;i<n;i++) {
			ar[i]=i;
		}
		for(int i=0;i<n;i++) {
			if(ar[i]!=0)
			{
				count++;
				if(count==a) {
					ar[i]=0;
					count=0;
					count1=count1-1;
				}
					
			}
			if(i==n-1 && a<count1) {
				count=0;
				i=0;
				a++;
		}
	}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0)
			System.out.println(ar[i]);
	}
	}
}
