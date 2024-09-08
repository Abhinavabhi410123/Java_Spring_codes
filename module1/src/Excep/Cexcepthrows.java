package Excep;

public class Cexcepthrows {

	public static void main(String[] args) {
		Cexcepthrows ce = new Cexcepthrows();
		try {
		ce.m1();
		}
		catch(Exception e){
			System.out.println("exception handled");
		}
	}
	void m1() throws Exception {
		m2();
		System.out.println("I am m1");
	}
	void m2() throws Exception {
		m3();
		System.err.println("I am m2");
	}
	void m3() throws Exception {
		throw new Exception();
		//System.err.println("I am m3");
	}

}
