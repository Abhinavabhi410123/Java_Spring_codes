package oopsp;
import java.util.*;
public class LLIST {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		list.remove(0);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
			
	}

}
