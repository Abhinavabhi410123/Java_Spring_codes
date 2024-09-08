package basicprograms;
import java.util.Random;
public class Smini {
public static void main(String[] args) {
	int[] a = new int[6];
	int[] ar = new int[a.length];
	Random r = new Random();
	for(int i=0;i<a.length;i++) {
		a[i]=r.nextInt();
	}
	int min = Integer.MAX_VALUE,temp1=0,secondmin=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(min>a[i]) {
			secondmin=min;
			min = a[i];
			//a[i]=secondmax;
			System.out.println("min "+min+" "+"secondmin"+secondmin+" temp"+temp1);
		}
		else if(secondmin>a[i]&& a[i]!=min) {//
			//temp1 = secondmax;
			secondmin = a[i];
			//a[i]=temp1;
			System.out.println("min "+min+" "+"secondmin "+secondmin+" temp"+temp1);
		}
	}
	for(int temp:a) {
		System.out.println(temp+"temp");
	}
	System.out.println();
	System.out.println(min+" min");
	System.out.println(secondmin+" secondmin");

}
}
