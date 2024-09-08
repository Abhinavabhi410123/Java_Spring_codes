package oopsp;

interface iii{
	void add();
	static void sub() {
		System.out.println("this is sub");
	}
}
public class Bank{
	static {
		System.out.println("static");
	}
//	public static void main(String[] args) {
//	iii i=()->{
//		System.out.println("this is add");
//	};i.add();
	}

