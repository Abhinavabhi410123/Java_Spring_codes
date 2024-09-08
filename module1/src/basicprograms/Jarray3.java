package basicprograms;

public class Jarray3 {

	public static void main(String[] args) {
		int[] a  = {1,2,3,4,5};
		int[] b = new int[a.length];
		int n = a.length,k=a.length-1;
		for(int i=0;i<=a.length-1;i++) {
			b[k]=a[i];
			k--;
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
	}

}
