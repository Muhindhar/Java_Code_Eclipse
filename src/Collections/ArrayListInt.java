package Collections;
import java.util.*;
public class ArrayListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> a = new ArrayList<>();
		System.out.println("Size of array : "+a.size());
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		Integer[] ob = new Integer[a.size()];
		ob = a.toArray(ob);
		int sum=0;
		for(int i : ob) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum of array : "+sum);
		
		System.out.println("Size of array : "+a.size());
		a.remove(2);
		System.out.println("Array after removing 2 (index): "+a);
		a.add(1, 0);
		System.out.println(a);
		a.set(1, 9);
		System.out.println(a);
		
	}

}
