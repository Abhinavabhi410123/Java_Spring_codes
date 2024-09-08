package Excep;
import java.util.Scanner;
public class Exceptupcast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		System.out.println(10/a);
		}
		catch(Exception ab ) {
			ab.printStackTrace();
		}
		try {
			System.out.println("enter a number");
			int a = sc.nextInt();
			int[] ar = new int[a]; 
			System.out.println(ar[a]);
		}
		catch(Exception e){
			System.out.println("array exception");
		}
		
	}

}
