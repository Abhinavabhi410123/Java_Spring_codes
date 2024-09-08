package basicprograms;
import java.lang.Math;
public class Armstrong {
	public static void main(String[] args) {
	int count=0,rem=0;
	double sum =0;
	for(int i=1;i<=100000;i++) {
		sum=0;
		count =0;
		for(int j=i;j>0;j/=10) {
			count++;
		}
		for(int k=i;k>0;k/=10) {
			rem = k%10;
			double cube = Math.pow(rem, count);
			sum = sum + cube;
		}
		if(sum==i)
			System.out.println(i+" is an armstrong number.");
	}
	}
}
