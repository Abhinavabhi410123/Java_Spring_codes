package Demo;

import java.util.Scanner;

public class SBI implements Rbi {

	public void withdrawal() {
		Scanner sc = new Scanner(System.in);
		int balance = 10000,wamount=0;
		System.out.println("enter balance");
		wamount = sc.nextInt();
		if(wamount>balance)
			System.out.println("amount not sufficient");
		else {
			balance = balance - wamount;
			System.out.println(" remaining amount is"+ balance);
		}
	}
}
