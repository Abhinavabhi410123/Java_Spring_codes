package basicprograms;

public class Jarray4 {
public static void main(String[] args) {
	int[] ar = {1,3,2,4,6,5};
	int[] a = {-1,2,-4,3,6,6};
	int max = Integer.MIN_VALUE,temp1=0,secondmax=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			secondmax=max;
			max = a[i];
			//a[i]=secondmax;
			System.out.println("max "+max+" "+"secondmax "+secondmax+" temp"+temp1);
		}
		else if(secondmax<a[i]&&a[i]<max) {
			//temp1 = secondmax;
			secondmax = a[i];
			//a[i]=temp1;
			System.out.println("max "+max+" "+"secondmax "+secondmax+" temp"+temp1);
		}
	}
	for(int temp:a) {
		System.out.println(temp+"temp");
	}
	System.out.println();
	System.out.println(max);
	System.out.println(secondmax);

}
}
