package Demo;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		A a1=new A(-10,1000);
		A a2=new A(20,200);
		A a3=new A(30,200);
		A a4=new A(40,400);
		ArrayList al=new ArrayList(Arrays.asList(a1,a2,a3,a4));
		for(int x=0;x<al.size();x++)
		{
			System.out.println(al.get(x));
		}
		System.out.println();
		Collections.sort(al);
		for(int x=0;x<al.size();x++)
		{
			System.out.println(al.get(x));
		}
	}
}
class A implements Comparable<A>
{
	int x;
	int marks;
	A(int x,int marks)
	{
		this.x=x;
		this.marks=marks;
		
	}
	@Override
	public String toString() {
		return "x is "+x+" marks are "+marks;
	}
	@Override
	public int compareTo(A o) {
		return Integer.compare( o.marks,this.marks);
	}
}



