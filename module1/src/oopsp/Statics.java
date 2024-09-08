package oopsp;

public class Statics {

	public static void main(String[] args) {
		Demo2 d= new Demo3();
		d.m2();
	}

}
class Demo2{
	static int y;
	int x=10;
//	  Demo2 m1() {
//		System.out.println("Hello");
//		System.out.println(y);
//		Demo2 d2 = new Demo2();
//		return d2;
//	}
	static void m2() {
		System.out.println("m2 method parent");
	}
}
class Demo3 extends Demo2{
//	Demo3 m1() {
//		Demo3 d3 = new Demo3();
//		return d3;
//	}
	static void m2() {
		System.out.println("m2 method child");
	}
}