package oopsp;

public class Methodoride {

	public static void main(String[] args) {
		hi h = new hi();
		//h.add();
		hello he = new hello();
		//he.add();
		hi h1 = new hello();
		//h1.add();

	}

}
class hi{
	void m1() {
		int a=10,b=20;
		System.out.println(a+b);
	}
	void m2() {
		int c = 30,d=40;
		System.out.println(d-c);
	}
	void m4() {
		int e =30,d=5;
		System.out.println(e/d);
	}
}
class hello extends hi{
	void m2() {
		int a =30,b=40;
		System.out.println(a+b);
	}
	void m3() {
		
	}
}