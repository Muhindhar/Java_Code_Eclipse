package Collections;
import java.util.*;
public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> a = new LinkedList<>();
		System.out.println("Size of array before adding :"+a.size());
		a.add("c");
		a.add("Java");
		a.add("Python");
		a.add("Kotlin");
		a.add("Javascript");
		a.add("Embedded C");
		a.add("C#");
		a.add("C++");
		System.out.println("The items in the array : "+a);
		System.out.println("Size of array after adding : "+a.size());
		a.remove("C++");
		System.out.println(a);
		a.removeFirst();
		System.out.println("List after removing first element : "+a);
		a.removeLast();
		System.out.println("Removing last element : "+a);
		LinkedList<String> b = new LinkedList<>();
		b.add("dog");
		b.add("cat");
		b.add("parrot");
		b.add("fish");
		System.out.println("List in the list b : "+b);
		//b = (LinkedList<String>) a.clone();
		
		System.out.println("cloning a with b"+b);
		a.addAll(b);
		System.out.println("A & B"+a);
		a.clear();
		System.out.println("List after clearing : "+a);
	}

}
