package Jarraysums;

public class Arraysplit {

	public static void main(String[] args) {
		int b[]= {3,1,5,2,4,9,7,8,6};
		int d[]=new int[b.length];
		for(int x=(b.length/2)+1,i=0;i<b.length;i++) {
			if(i%2==0)
			d[i/2]=b[i];
			else {
			d[x]=b[i];
			//System.out.println(i+"ivalue");
			x++;
			}
		}
		for(int t:d)
			System.out.println(t);

	}

}
