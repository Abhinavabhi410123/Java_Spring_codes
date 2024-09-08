package oopsp;
import java.util.*;
public class Comp {

	public static void main(String[] args) {
		ArrayList <Integer>al = new ArrayList <Integer>();//(Arrays.asList("Apple","cat","bat","apple"));
		al.sort(Comparator.naturalOrder());
		System.out.println(al);
		int []  a = {10,20,30,40,50,60,70,80};
		for(int i=0;i<a.length;i++) {
			al.add(a[i]);
		}
		System.out.println(Collections.binarySearch(al, 50));;
		Collections.rotate(al, 4);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 50));
		
	}

}
