package Excep;
import java.util.Scanner;
public class Custexcep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age");
		int age = sc.nextInt();
		if(age<18 || age>=60) {
			throw new VoterException("not eligible to vote");
		}
		else
			System.out.println("Welcome");

	}

}
class VoterException extends RuntimeException {
	VoterException(){
		super();
	}
	VoterException(String s){
		super(s);
	}
}
