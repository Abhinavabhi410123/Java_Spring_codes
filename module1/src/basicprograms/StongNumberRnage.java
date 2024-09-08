package basicprograms;

public class StongNumberRnage {

	public static void main(String[] args) {
		int rem=0,prod=1,sum=0;
	
		for(int i=1;i<100000;i++)
		{
			sum=0;
			for(int j=i;j>0;j/=10) {
				 rem = j%10;
				 prod = 1;
			for(int k=rem;k>1;k--) {
				 prod = prod*k;
			}
			sum = sum + prod;
		}
			if(sum==i)
				System.out.println("strong number is "+i);
	}

}
}
