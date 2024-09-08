
public class Collectionsjav {

	public static void main(String[] args) {
		newc c = new newc();
		Student st = c.meth();
		System.out.println(st.getcount());
	}

}
interface i{
	int getcount();
}
class Student implements i{
	@Override
	public int getcount() {
		return 10;
	}
}
class newc {
	public Student meth() {
		return new Student();
	}
}
