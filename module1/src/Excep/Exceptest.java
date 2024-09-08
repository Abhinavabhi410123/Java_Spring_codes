package Excep;

public class Exceptest {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		}
		catch(Exception e){
			System.out.println("handled");
		}
		finally {
			try {
			throw new ArrayIndexOutOfBoundsException();
			}
			catch(Exception e) {
				System.out.println("handled finally");
			}
		}
	}
	}
