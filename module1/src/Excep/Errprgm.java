package Excep;

public class Errprgm {

	public static void main(String[] args) {
		Errprgm er = new Errprgm();
		er.m1();

	}
void m1() {
	m2();
}
void m2()  {
	try {
	m1();
	}
	catch(Exception e){
		System.out.println("error overflow");
	}
}
}
