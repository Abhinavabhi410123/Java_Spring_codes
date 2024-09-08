import java.util.Scanner;
class max_secondmax{
		public static void main(String[] args){
				System.out.println("enter a number");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt(),secondmax=0,max=0,count=1,temp = num,rem=0;
				for( ;num>0;num/=10){
						rem = num%10;
						 if(rem>max)
							{
							secondmax = max;
							max = rem;
							}
						else if(rem>secondmax && rem!=max)
							secondmax = rem;
							}
							}
							}
							