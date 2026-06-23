package HandsOn10;
import java.util.*;
public class Concat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		String e="";
		sc.nextLine();
		List <String> c = new ArrayList<>(m);
		for(int i=0;i<m;i++) {
			String a = sc.nextLine();
			c.add(a);
		}
		for(String a : c) {
			e += a+" ";
		}
		System.out.println("Elements in the set : "+e);
	}

}
