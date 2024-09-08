package Stringprobs;

public class Stringmethods {
	
	public static void main(String[] args) {
	//Employee e1 = new Employee();
	//e1.display();
	//Employee e2 = new Employee(18);
	Boss b1 = new Boss();
	//Manager m1 = new Manager();
	}
}
class Employee{
	static String name ="abhi";
	static int id=10,age=20;
	Employee(){
		System.out.println("Employee constructor");
	}
//	Employee(String name,int age){
////		this(18);
//		this.name = name;
//		this.id=age;
//		System.out.println("Employee constructor");
//	}
	Employee(int age){
		this.age = age;
	}
	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}
class Manager extends Employee{
	int age;
	String name;
	Manager(){
		System.out.println("manager constructor");
	}
//	Manager(String name,int age){
//		this.name = name;
//		System.out.println(name);
//		this.age = age;
//		System.out.println(age);
//	}
	
}
class Boss extends Manager{
	Boss(){
		System.out.println("boss constructor");
	}
}
