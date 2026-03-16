package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Double> tm = new TreeMap<String,Double>();
		System.out.println("Size : "+tm.size());
		tm.put("john", 1223.32);
		tm.put("tom", 238.78);
		tm.put("jane", 9238.3);
		tm.put("raiph", 345.86);
		
		System.out.println("elements in map : "+tm);
		System.out.println("Size after adding : "+tm.size());
		
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		System.out.println(set);
		
		for(Map.Entry<String, Double> me:set) {
			System.out.println(me.getKey()+" ");
			System.out.println(me.getValue());
		}
	}

}
