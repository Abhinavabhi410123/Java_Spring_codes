package oopsp;
import java.util.*;
public class Kojoc {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList();
		al.add(new Student(11,"abhi"));
		al.add(new Student(12,"abhinav"));
		System.out.println(al);
	

	}

}
class Student{
	int roll;
	String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
