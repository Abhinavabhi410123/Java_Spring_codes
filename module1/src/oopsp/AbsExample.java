package oopsp;

public class AbsExample {

	public static void main(String[] args) {
		B a=new C();
		a.m1();
		a.m();
		a.m2();
		a.m3();
	}
}
abstract class A
{
	abstract void m1();
	void m2()	
	{
		System.out.println("i am in A");
		}
	void m3()
	{
		System.out.println("i am in m3");
	}
}
abstract class B extends A
{
	abstract void m();
}
class C extends B
{
	@Override
	void m() {
		System.out.println("i am in m");
	}
	void m1() {
		System.out.println("i am in m1");
	}
}