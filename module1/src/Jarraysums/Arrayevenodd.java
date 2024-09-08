package Jarraysums;

import java.util.Arrays;

public class Arrayevenodd {

	public static void main(String[] args) {
		int a[]= {5,2,3,1,4,7,8,6,10,9,11};
		int d[] = new int[a.length];
		int b[] = new int[a.length/2+1];
		int c[] = new int[a.length/2];
		int max=0,l=d.length/2-1,temp=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				b[i/2]=a[i];
			}
			else 
			{
				c[l]=a[i];
				//System.out.println(l+" l value");
				//System.out.println(i+" i value");
				l--;
			}
		}
		Arrays.sort(b);
		for(int t:b)
			System.out.print(t+" ");
		System.out.println();
		Arrays.sort(c);
		for(int t:c)
			System.out.println(t);
		
	}

}
