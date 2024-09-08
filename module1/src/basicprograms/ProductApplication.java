package basicprograms;
import java.util.Scanner;
public class ProductApplication {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to apple store.\nEnter a number for selcting variant of product \n1.Iphone13\n2.Iphone14\n3.Iphone15.");
	int a = sc.nextInt(),price=0,op=1;
	while(op!=2) {
	switch(a) {
	case 1:
		System.out.println("You have choosen Iphone 13.\nEnter your preferred colur please:\n1.red price:77900\n2.blue: 78900\n3.black: 71500 ");
		int color = sc.nextInt();
		if(color==1)
			price = price+77900;
		else if(color==2)
			price =price+ 78900;
		else if(color==3)
			price = price+71500;
		else
			System.out.println("enter valid option");
		System.out.println("Choose storage options:\n1.128gb\n2.256gb\n3.512gb");
		int s = sc.nextInt();
		if(s==2)
			price = price+10000;
		else if(s==3)
			price = price+20000;
		System.out.println("choose quantity:");
		int quantity = sc.nextInt();
		price = price*quantity;
		System.out.println("So your final price is:"+price);
		System.out.println("Would you like to continue shopping? press 1 for yes , 2 for no");
		 op = sc.nextInt();
		if(op==1)
			continue;
		else if(op==2)
			break;
		else
			System.out.println("enter valid number");
	case 2:
		System.out.println("You have choosen Iphone 14.\nEnter your preferred colur please:\n1.red price:77900\n2.blue: 78900\n3.black: 71500 ");
		 color = sc.nextInt();
		if(color==1)
			price =price+ 77900;
		else if(color==2)
			price =price+ 78900;
		else if(color==3)
			price =price+ 71500;
		else
			System.out.println("enter valid option");
		System.out.println("Choose storage options:\n1.128gb\n2.256gb\n3.512gb");
		int s1 = sc.nextInt();
		if(s1==2)
			price = price+10000;
		else if(s1==3)
			price = price+20000;
		System.out.println("choose quantity:");
	    quantity = sc.nextInt();
		price = price*quantity;
		System.out.println("So your final price is:"+price);
		System.out.println("Would you like to continue shopping? press 1 for yes , 2 for no");
	    op = sc.nextInt();
		if(op==1)
			continue;
		else if(op==2)
			break;
		else
			System.out.println("enter valid number");
	default:
		System.out.println("Enter a correct value");
	}
	}
	System.out.println("Thank you for shopping with us,Please visit again  :)");
}
}
