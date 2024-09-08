package basicprograms;

public class jarray2 {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5};
		int k=5;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				System.out.println("i value "+i+" "+j+" ja value ");
				if(a[i]+a[j]==k) {
					System.out.println(i+" i value "+j+" j value");
				}
			}
		}
		

	}

}
