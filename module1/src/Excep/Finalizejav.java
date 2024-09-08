package Excep;

public class Finalizejav {
	int roll=0;
	public static void main(String[] args) {
		Finalizejav f = new Finalizejav();
		f = null;
		System.gc();
		System.out.println(f);
	}

	
	protected void finalize() throws Throwable {
		System.out.println("object destroyed");
	}

	@Override
	public String toString() {
		return "Finalizejav []";
	}

}
