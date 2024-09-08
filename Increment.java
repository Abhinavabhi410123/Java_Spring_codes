class Hi{
		public static void main(String[] args){
		int a = 479,b=0,rem=0,dup;
		for( ;a>0;a/=10){
			rem = a%10;
			if(rem==9)
			System.out.print(b);
			else
			System.out.print(rem+1);
			}
			}
			}