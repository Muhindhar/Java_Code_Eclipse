package Collections;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> st = new Stack<>();
		System.out.println("Size before adding : "+st.size());
		st.add("a");
		st.add("c");
		st.add("b");
		st.add("d");
		System.out.println("Stack :  "+ st);
		System.out.println("Size after adding : "+st.size());
		st.pop();
		System.out.println("Deleting the last elem : "+st);
		st.push("M");
		System.out.println("Adding ele m : "+st);
	}

}
