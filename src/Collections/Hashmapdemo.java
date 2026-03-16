package Collections;
import java.util.*;
public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Aut	o-generated method stub
		HashMap<String, Double> tm = new HashMap<String,Double>();
		System.out.println("Size : "+tm.size());
		tm.put("Muhindhar", 1223.32);
		tm.put("Jane", 238.78);
		tm.put("John", 9238.3);
		tm.put("Raiph", 345.86);
		tm.put("zx", 1037.0);
		tm.put("apple", 9876.2);
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
