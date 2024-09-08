import java.util.Scanner;

class Maxnum{
		public static void main(String []args){
				System.out.println("enter a number");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt(),max=0,secondmax=0,temp=num,rem=0;
				for( ;num>0;num/=10){
						rem = num%10;
						if(rem>max)
						max = rem;
					}
					num = temp;
					System.out.println("the max number is :"+max);
					
				for( ;num>0;num/=10){
						rem = num%10;
						if(rem<max)
						{
						if(rem>secondmax)
						secondmax = rem;
						}
					if(secondmax==0){
					secondmax = max;
					System.out.println("all the numbers are equal");
					}

					}
					System.out.println("the secondmax number is :"+secondmax);
					}
					}