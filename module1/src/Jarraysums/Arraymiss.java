package Jarraysums;

import java.util.Arrays;

public class Arraymiss {

	public static void main(String[] args) {
		int a[]= {1,3,3,4,7,7,9} ;
		Arrays.sort(a);
		int i=a[0],j=0;//
		for(;i<=a[a.length-1];) {
			if(j!=0&&a[j]==a[j-1]) {
				j++;
			}
			if(a[j]!=i) {
				System.out.println(i);
				i++;
			}
			else {
				j++;
				i++;
			}
					}

	}

}
