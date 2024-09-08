package oopsp;
import java.util.*;
public class Comparatorjava {

	public static void main(String[] args) {
	Studentsss s1 = new Studentsss(1,"abhi");
	Studentsss s2 = new Studentsss(2,"ravi");
	Studentsss s3 = new Studentsss(3,"kiran");
	List<Studentsss> list = new ArrayList<Studentsss>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	Collections.sort(list,new Rollsort());
	System.out.println(list);
	}
	
}

class Studentsss
{
	int roll;
	String name;
	public Studentsss(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
}
class Rollsort implements Comparator<Studentsss>{

	@Override
	public int compare(Studentsss o1, Studentsss o2) {
		return Integer.compare(o1.roll,o2.roll);
	}
	
}