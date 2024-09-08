package SpringBridge;

public class One {

	@Override
	public String toString() {
		return "One [roll=" + roll + ", name=" + name + ", section=" + section + "]";
	}
	int roll;
	String name;
	String section;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public One(int roll, String name, String section) {
		super();
		this.roll = roll;
		this.name = name;
		this.section = section;
	}
	public One() {
		super();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}

}
