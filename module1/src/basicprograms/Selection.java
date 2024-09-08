package basicprograms;

public class Selection {

	public static void main(String[] args) {
		int a[]= {1,3,2,5,7,6};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			int minindex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minindex]) {
					minindex = j;
				}
			}
			temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
