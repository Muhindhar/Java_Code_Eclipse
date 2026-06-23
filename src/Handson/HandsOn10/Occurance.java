package HandsOn10;
import java.util.*;
public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = sc.nextLine();
		HashMap<Character, Integer> n = new HashMap<>();
		for(char ch : a.toCharArray()) {
			if(n.containsKey(ch)) {
				n.put(ch, n.get(ch)+1);
			}
			else {
				n.put(ch, 1);
			}
		}
		System.out.println(n);
	}

}
