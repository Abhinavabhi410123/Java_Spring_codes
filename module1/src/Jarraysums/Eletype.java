package Jarraysums;

public class Eletype {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,-1,-2,-3};
		int count=0;
		double b[]=new double[4];
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				b[1]+=1;
				if(a[i]%2==0) {
					b[2]+=1;
				}
				else {
					b[0]+=1;
				}
			}
			else{
				b[3]+=1;
				if(a[i]%2==0) {
					b[2]+=1;
				}
				else
					b[0]+=1;
			}
		}
		System.out.println("positives are:"+b[1]);
		System.out.println("negatives are:"+b[3]);
		System.out.println("even are:"+b[2]);
		System.out.println("odds are:"+b[0]);
	}

}
