package HandsOn1;
import java.util.*;
public class CtflM3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of pages : ");
		int pg = sc.nextInt();
		System.out.println("Enter the number of copies : ");
		int cp = sc.nextInt();
		int pgtype = pg*3;
		
		int total = pgtype + pgtype*(cp-1)+pg;
		System.out.println(total);
		
	}
}
