package Collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> v = new Vector<>();
		System.out.println("Size before adding :" + v.size());
		v.add("muhi");
		v.add("krishna");
		v.add("jeeva");
		v.add("tamil");
		
		System.out.println(v);
		System.out.println("size after adding :"+v.size());
		System.out.println("Capacity : "+v.capacity());
	}

}
