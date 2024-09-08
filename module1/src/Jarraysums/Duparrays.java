package Jarraysums;

import java.util.Arrays;

public class Duparrays {

	public static void main(String[] args) {
		int[] a = {12,12,12,12,12,10,10,10,11,20,30};
		Arrays.sort(a);
		int index=0,findex=0;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int s=0,l=a.length-1,search=12;
		for(;s<=l;) {
			int m=(s+l)/2;
			//System.out.println(m);
			if(a[m]==search) {
				System.out.println("element found at index: "+m);
				 index = m;
				break;
			}
			if(a[m]>search) {
				l=m-1;
			}
			if(a[m]<search) {
				s = m+1;
			}
		}
		for(int i=index;a[i]==search;i--) {
			findex = i;
			if(i-1<0) {
				break;
			}
			}
		for(int i=findex;a[i]==search;i++) {
			if(i!=index)
			System.out.println("index: " +i);
		
		}
	}

}
