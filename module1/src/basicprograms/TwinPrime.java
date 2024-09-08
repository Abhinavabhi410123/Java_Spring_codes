package basicprograms;
import java.util.Scanner;
import java.lang.Math;
public class TwinPrime {

	public static void main(String[] args) {
		int count=0, count1=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
			int a = sc.nextInt();
	System.out.println("enter the second number");
	int b = sc.nextInt();
	for(int i=1;i<=a/2;i++) {
		if(a%i==0)
			count++;
	}
	for(int j=1;j<=b/2;j++) {
		if(b%j==0)
			count1++;
	}
	int diff = Math.abs(a-b);
	if(count==1 && count==1 &&diff==2) {
		
			System.out.println("given two numbers are twin primes");
	}
	else
		System.out.println("not twin primes");
	}

}
