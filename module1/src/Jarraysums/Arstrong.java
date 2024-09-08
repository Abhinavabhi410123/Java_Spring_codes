package Jarraysums;

public class Arstrong {

	public static void main(String[] args) {
		Strong s = new Strong();
		int ar[]= {10,20,121,145,12,13};
		s.arstrong(ar,0);
}
}
class Strong{
	void arstrong(int a[],int sum) {
		for(int i=0;i<a.length;i++) {
			int factorial=1;
			sum=0;
			for(int j=a[i];j>0;j/=10) {
				int rem = j%10;
				 factorial = fact(rem,1);
				sum +=factorial;
				//System.out.println(sum);
			}
			
			if(sum==a[i]) {
				System.out.println("strong "+a[i]);
			}
		}
	}
	int fact(int num,int pro) {
		if(num!=0) {
			pro = pro*num;
			return fact(num-1,pro);
		}
		else
			return pro;
	}
		
	}
