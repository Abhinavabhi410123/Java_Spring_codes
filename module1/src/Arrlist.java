import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.*;

public class Arrlist {
	public static void main(String[] args) {
		//Set<> set = new HashSet<>(Arrays.asList(10,30,20,50,70,null));//removes duplicates but order is missed
	//	Set<> set1 = new TreeSet<>(Arrays.asList(10,30,20,50,70,'hi',"good morning"));//sorts the data
	//	Set<Charecter>set1 = new TreeSet<Charecter>();
		//set1.add('h');
		ArrayDeque ar = new ArrayDeque(Arrays.asList(10,20,30,40,50));
		Iterator itr = 	ar.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		Set<Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(10,30,20,50,70,null));//removes the duplicates and retains insertion order
//		System.out.println(set);
//		System.out.println(set1);
//		System.out.println(set2);
//		List al=new LinkedList<>() ;
//		al.add(32);
//		al.add(32);
//		al.add(32);
	//	al = new LinkedList<>();
		//Set<Integer> hs= new HashSet<>(al);
		//hs.add(32);
		//hs.add(17);
//		hs.add(1);
//		hs.addAll(arr);
		//System.out.println(hs);
		
	}

}
