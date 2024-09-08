package oopsp;

public class Inheritancem {

	public static void main(String[] args) {
		Child c = new Child();
		Grandchild g = new Grandchild();
		System.out.println(g.x);
	}

}
class Parent{
	Parent(){
		System.out.println("parent constructor");
	}
}
class Child extends Parent{
	int x=10;
	Child(){
		System.out.println("child constructor");
	}
}
class Grandchild extends Child{
Grandchild(){
	super.x=5;
}
}
