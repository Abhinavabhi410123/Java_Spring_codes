package Demo;
import java.util.*;
public class Hdfc implements Rbi{

	public void withdrawal() {
		Scanner sc = new Scanner(System.in);
		int balance = 10000,wamount=0;
		System.out.println("enter withdeawal amount");
		wamount = sc.nextInt();
		if(wamount>balance)
			System.out.println("amount not sufficient");
		else {
			balance = balance - wamount;
			System.out.println(" remaining amount is "+ balance);
		}
	}

}
