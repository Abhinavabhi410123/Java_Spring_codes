package basicprograms;

public class Arpalindrome {

	public static void main(String[] args) {
		Checkp p = new Checkp();
		int a[]= {121,141,122,142,143};
		p.palindrome(a,0);
	}
}
class Checkp{
	void palindrome(int[] a,int sum) {
		for(int i=0;i<a.length;i++) {
			int count=0;sum=0;
			for(int j=a[i];j>0;j/=10) {
				int rem = j%10;
				sum = sum*10+rem;
			}
			if(sum==a[i]) {
				System.out.println("palindromes "+a[i]);
			}
		}
	}
}