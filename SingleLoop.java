import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
class max_secondmax{
		public static void main(String[] args){
				System.out.println("enter a number");
				//Scanner sc = new Scanner(System.in);	
				Random r = new Random();
				int num =r.nextInt() ,secondmax=Integer.MIN_VALUE,max=Integer.MIN_VALUE,count=1,temp = num,rem=0;
				//num = Math.abs(num);
				System.out.println(num);
				for( ;num!=0;num/=10){
						rem = Math.abs(num%10);  
						 if(rem>max)
							{
							secondmax = max;
							max = rem;
							}
						else if(rem>secondmax && rem!=max)
							secondmax = rem;
							}
						System.out.println("the max number is " + max);
						System.out.println("the secondmax number is " + secondmax);

							}
							}
							