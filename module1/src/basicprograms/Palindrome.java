package basicprograms;

public class Palindrome {

	public static void main(String[] args) {
		int rem =0,sum=0;
		for(int i=0;i<10000;i++) {
			sum=0;
			rem=0;
			for(int j=i;j>0;j/=10) {
				rem = j%10;
				sum = sum*10+rem;
			}
			if(sum==i)
				System.out.print(i+" it is a palindrome\n");
		}

	}

}
