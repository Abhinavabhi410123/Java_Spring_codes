package oopsp;

import java.util.*;

public class Pass {

	public static void main(String[] args) {
		Integer[] a = {10,20,30,40,50};
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(a));
		for(int x=0;x<ar.size();x++) {
			if(ar.indexOf(ar.get(x))==ar.lastIndexOf(ar.get(x))) {
				System.out.println(ar.get(x));
			}
		}
	}

}
