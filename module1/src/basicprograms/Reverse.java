package basicprograms;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),sum=0,rem=0,count=0,count1=0,sum1=0;;
		 
		for(;a>0;a/=10) {
			count++;
			rem = a%10;
			sum = sum*10+rem;
		}
		System.out.print(sum+"\n");
		for(;sum>0;sum/=10) {
			count1++;
			rem = sum%10;
			sum1 = sum1*10+rem;
		}
		if(count!=count1) {
			sum1 = (int) (sum1*Math.pow(10, count-count1));
		}
		System.out.println(sum1);
	}

}
