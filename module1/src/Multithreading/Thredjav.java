package Multithreading;

public class Thredjav {


	public static void main(String[] args) {
		Runnable r2 =()->
		{
			for(int i=0;i<10;i++) 
				System.out.println(Thread.currentThread().getName());
		};
		Runnable r3 = new Runnable() { 
			public void run() {
				for(int i=0;i<10;i++) 
					System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t1 = new Thread(r2);
		Thread t2 = new Thread(r3);
		t1.start();
		t2.start();
	}
	}



