package Excep;

public class Custexceptio {

	public static void main(String[] args)  {
		int age = 17;
		try {
		if(age<18) {
			throw new AgeException("below 18 not allowed");
		}
		}
		catch(AgeException ae){
			System.out.println(ae.getMessage());
		}
	}

}

class AgeException extends Exception{
	AgeException(String str){
		//super(str);
	}
}