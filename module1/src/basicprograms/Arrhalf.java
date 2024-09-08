package basicprograms;

public class Arrhalf {
public static void main(String []args) {
	int []a= {10,20,30,40,50,60};
	int n =a.length,y=0;
	int b[] = new int[n/2];
	int c[]=new int[n/2];
	for(int i=n/2;i<n;i++,y++) {
		b[y]=a[i];
	}
	for(int j=0;j<n/2;j++) {
		c[j]=a[j];
	}
	for(int k=0;k<b.length;k++) {
		System.out.println(b[k]);
	}
}
}
