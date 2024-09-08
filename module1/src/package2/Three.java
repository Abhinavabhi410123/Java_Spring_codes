package package2;
import package1.Two;
public class Three  {
Three(){
	System.out.println("I am three constructor");
}
	public static void main(String args[]) {
	Two two = new Two();
	two.setA(20);
	//System.out.println(two.getA());
	two.setB(30);
	//System.out.println(two.getB());
	System.out.println(two);
	}
	
}
