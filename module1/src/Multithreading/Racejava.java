package Multithreading;

public class Racejava {

	public static void main(String[] args) {
		Sample sample = new Sample();
		Thread t1 = new Thread(sample);
		Thread t2 = new Thread(sample);
		t1.setName("abhi");
		t2.setName("abhinav");
		t1.start();
		t2.start();
//		t1.setPriority(10);
//		t2.setPriority(5);
		t1.interrupt();
	}

}
class Sample implements Runnable{
	int num;
	@Override
	public void run() {
		//m1();
		for(int i=0;i<10;i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
//	public synchronized void m1() {
//		for(int i=0;i<10;i++) {
//			num++;
//			System.out.println(num+" "+Thread.currentThread().getName());
//		}
	}
	
//}

