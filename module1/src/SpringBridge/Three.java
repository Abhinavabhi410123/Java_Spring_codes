package SpringBridge;

public class Three {
int roll;
String name;
String code;
public Three(int roll, String name, String code) {
	super();
	this.roll = roll;
	this.name = name;
	this.code = code;
	
}
public int m2() {
	return 100;
}
public Three() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Three [roll=" + roll + ", name=" + name + ", code=" + code + "]";
}


}
