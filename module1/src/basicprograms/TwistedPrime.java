package basicprograms;

public class TwistedPrime {

	public static void main(String[] args) {
		int temp=0,count=0,rem=0,sum=0,count1=0;
		for(int i=3;i<=100000;i++) {
			count=0;
			count1=0;
			sum=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
					count++;
			}
			if(count<1) {
				for(int k=i;k>0;k/=10) {
					rem = k%10;
					sum = sum*10 + rem;
				}
				for(int l=2;l<sum/2;l++) {
					if(sum%l==0)
						count1++;
				}
				if(count1<1)
						System.out.println(i+" has twisted prime");
			}
		}
	}

}
