package SpringBridge;

public class Special1 {

	public static void main(String[] args) {
		Three three = new Three(1,"abhi","c");
		Special sp = new Special(three);
		System.out.println(sp);
		Special1 sp1 = new Special1();
		sp1.call();
	}
	public void call() {
		Three t = new Three();
		System.out.println(t.m2());
	}

}
