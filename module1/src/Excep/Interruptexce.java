package Excep;

public class Interruptexce extends Thread {

	public static void main (String[] args)throws InterruptedException {
		m1();
	}
	static void m1() throws InterruptedException {
		m2();
	}
	static void m2() throws InterruptedException {
		Thread.sleep(1000);
		//Thread.interrupted();
	}

}
