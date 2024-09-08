package basicprograms;
import java.util.Scanner;
public class Binarycon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt(),temp=a;
		int b = 1;
		for(;a>Math.pow(2, b);) {
			b++;
		}
		int c = b;
		for(;a>0;b--) {
			if(a>=(int)Math.pow(2, b)) {
			a = a - (int)Math.pow(2, b);
			if(a>=0)
				System.out.print(1);
			}
			else {
				System.out.print(0);
			}
			
		}
		
		if(temp == (int)Math.pow(2,c)) {
			for(int j=0;j<c;j++)
			System.out.print(0);
		}
	}

}
