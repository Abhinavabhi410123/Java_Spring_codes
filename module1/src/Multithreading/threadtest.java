package Multithreading;

public class threadtest extends Thread{

	public static void main(String[] args) {
		threadtest t = new threadtest();
		//t.setName("main");
		System.out.println(t.getName());
		t.run();
	}
	public void run() {
		System.out.println("run method");
	}

}
