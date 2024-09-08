package basicprograms;

public class TwinPrimeRange {
		public static void main(String[] args) {
			int count=0,temp=0,count1=0;
			for(int i=2;i<100;i++) {
				count=0;
				count1=0;
				for(int j=2;j<i/2;j++) {
					if(i%j==0)
						count++;
				}
				temp = i;
				temp+=2;
				if(count<1) {
					for(int k=2;k<=temp/2;k++) {
						if(temp%k==0)
							count1++;
					}
					if(count1<1)
					{
						System.out.println("the twin primes are "+i+" and "+temp);
					}
			}
		}
}
}
