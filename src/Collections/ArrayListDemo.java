package Collections;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ArrayList <String> arr = new ArrayList<>();
		System.out.println("Initial size of array : "+arr.size());
		arr.add("a");
		arr.add("b");
		arr.add("m");
		arr.add("d");
		System.out.println("Size of array : "+arr.size());
		arr.remove("d");
		System.out.println("Array after rem d"+arr);
		arr.remove(2);
		System.out.println("Array after removing 2 pos : "+arr);
		arr.add(0, "m");
		System.out.println("array after replacing m by a"+arr);
	}

}
