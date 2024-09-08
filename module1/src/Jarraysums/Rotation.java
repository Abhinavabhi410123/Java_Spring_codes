package Jarraysums;

public class Rotation {

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50,60,0};
		int b=80,x,index=3;
		for( x=ar.length-1;x>index;x--) {
			ar[x]=ar[x-1];
		}
		System.out.println(x+" index");
		ar[x]=b;
		for(int t:ar) {
			System.out.println(t);
		}
	}

}
