package oopsp;
import java.util.*;
public class Mapsjava {

	public static void main(String[] args) {
		
		Map<Integer,String> maps = new LinkedHashMap<Integer,String>();
		maps.put(1, "abhi");
		maps.put(2,"ravi");
		maps.put(6, "Vnekat");
		maps.put(5,"bhanu");
		maps.put(4, "Amar");
		maps.put(1, "a");
		maps.put(2,"r");
		maps.put(6, "V");
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		//map1.putAll(maps);
		map1.put(1, "abhi");
		map1.put(2,"ravi");
		map1.put(6, "Vnekat");
		map1.put(5,"bhanu");
		map1.put(4, "Amar");
		map1.put(111, "a");
		map1.put(22,"r");
		map1.put(61, "V");
//		System.out.println(map1.keySet());
//		System.out.println(map1.values());
//		System.out.println(map1.entrySet());
		Map<Integer,String> map2 = new TreeMap<Integer,String>();
		map2.putAll(map1);
		Set s = maps.entrySet();
//		System.out.println("set values");
//		for(Object o:s)
//			System.out.println(o);
//		for(Map.Entry<Integer, String> temp: map1.entrySet())
//				System.out.println(temp);
		maps.computeIfPresent(1,(key,value)-> "abhinav");
		System.out.println(maps);
		maps.computeIfAbsent(15,value-> "java");
		System.out.println(maps);
//		System.out.println(maps);
//		System.out.println(map1);
//		System.out.println(map2);

	}

}
