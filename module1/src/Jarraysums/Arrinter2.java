package Jarraysums;

public class Arrinter2 {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,9};
		int a=0,count=0;
		for(int x=0;x<ar.length;x++) {
			a = x+1+count;
			//System.out.println(x);
			if(a!=ar[x]) {
				for(int j=ar[x-1]+1;j<ar[ar.length-1];j++) {
					System.out.println(j);
				}
				//System.out.println(x);
				
			}
		}

	}

}
