package HandsOn10;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<String, Integer> s = new HashMap<>(n);
		 Stack<String> st = new Stack<>();
		for(int i=0;i<n;i++) {
			System.out.println("Name");
			String m = sc.nextLine();
			System.out.println("Mark");
			int o = sc.nextInt();
			sc.nextLine();
			s.put(m, o);
		}
		
		System.err.println("The values in the map :");
		for(Map.Entry<String, Integer> entry : s.entrySet()) {
			if(entry.getValue()>75) {
				st.push(entry.getKey());
			}
		}
		System.out.println("Students with mark >75");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
