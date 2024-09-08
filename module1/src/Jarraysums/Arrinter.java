package Jarraysums;

public class Arrinter {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int t:a)
			sum+=t;
		for(int t:a)
			System.out.println(sum/t);	
	}

}
