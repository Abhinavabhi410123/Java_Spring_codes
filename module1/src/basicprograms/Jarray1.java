package basicprograms;

public class Jarray1 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int [] b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(i==0) 
				b[i]=a[i]+a[i+1];
			else if(i==a.length-1)
				b[i]=a[i]+a[i-1];
			else
				b[i]=a[i-1]+a[i+1];
				
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}

	}

}
