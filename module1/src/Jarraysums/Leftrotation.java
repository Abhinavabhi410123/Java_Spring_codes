package Jarraysums;

public class Leftrotation {

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50,60};
		int b=80,x,index=3;
		for( x=index;x<ar.length-1;x++) {
			ar[x]=ar[x+1];
		}
		ar[x]=0;
		System.out.println(x+" index");
		for(int t:ar) {
			System.out.println(t);
		}
		
	}
	

}
