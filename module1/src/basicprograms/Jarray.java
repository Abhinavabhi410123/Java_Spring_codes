package basicprograms;

public class Jarray {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5};
		int k=5,n=a.length;
		System.out.println(n);
		for(int i=0;i<a.length/2;i++) {
			if(a[i]+a[n-i-1]==k) {
				System.out.println("i value "+i+"j value "+(n-i-1));
			}
			else
				System.out.println("hi");
		}
	}

}
