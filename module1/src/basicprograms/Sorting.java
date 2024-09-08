package basicprograms;

public class Sorting {

	public static void main(String[] args) {
		int[] a= {11,45,53,12,21};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

}
