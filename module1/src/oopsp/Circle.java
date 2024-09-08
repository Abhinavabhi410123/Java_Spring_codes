package oopsp;
import java.lang.Math;
public class Circle {
	int r;
	Circle(int r){
		this.r = r;
	}
	double area() {
		double area = Math.PI*r*r;
		return area;
	}
	public static void main(String[] args) {
		
		Circle c = new Circle(10);
		System.out.println(c.area());
	}

}
