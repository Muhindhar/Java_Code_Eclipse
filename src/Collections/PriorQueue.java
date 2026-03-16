package Collections;
import java.util.*;
public class PriorQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <String> p = new PriorityQueue<>();
		p.add("c");
		p.add("a");
		p.add("d");
		p.add("f");
		p.add("b");
		p.add("e");
		System.out.println("Elements in the priority queue");
		while(!p.isEmpty()) {
			System.out.print(p.poll());
		}
	}
}
