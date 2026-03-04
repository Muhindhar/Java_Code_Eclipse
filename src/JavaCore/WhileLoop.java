package JavaCore;
import java.util.*;
public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 10,seat=0;
		while(seat<=max) {
			System.out.println(max-seat);
			seat++;
		}
		System.out.println("Seats are filled");
	}
}
