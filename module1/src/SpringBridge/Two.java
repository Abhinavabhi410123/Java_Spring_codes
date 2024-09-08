package SpringBridge;

public class Two {

	public static void main(String[] args) {
		One one = new One();
		one.setName("abhi");
		one.setRoll(10);
		one.setSection("c");
		System.out.println(one);
		Three three = new Three(10,"abhi","alsndnjf");
		System.out.println(three);
		
	}

}
