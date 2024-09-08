package Jarraysums;

public class Splitarr {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		int l = ar.length;
		int []d= new int[l];
		for(int i=0;i<l/2;i++) {
			d[i]=ar[i];
		}
		for(int m=l/2,j=l-1;j>l/2-1;j--,m++) {
			d[m]=ar[j];
		}
			for(int a=0;a<l;a++) {
				System.out.print(d[a]);
			}
	}

}
