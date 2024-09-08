package Jarraysums;

import java.util.Arrays;

public class Arraysortevenodd {

	public static void main(String[] args) {
		int a[] = {1,2,2,3,3,5,6,8,9};
		Arrays.sort(a);
		int i=1,j=0;
		for(;i<=a[a.length-1];) {
			if(a[j]!=i) {
				System.out.println(i);
			}
			else 
			j++;
		}
		
	}

}
