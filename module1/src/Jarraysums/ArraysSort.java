package Jarraysums;

public class ArraysSort {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int l=a.length;
		int temp=0;
		for(int i=0;i<a.length-1;i=i+2) {
			temp = a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			//System.out.println(a[i]+" "+a[i+1]);
		}
		if(l%2!=0)
		{
		temp = a[a.length-1];
		a[a.length-1]=a[a.length-2];
		a[a.length-2]=temp;
		}
		for(int t:a)
			System.out.println(t);
	}

}
