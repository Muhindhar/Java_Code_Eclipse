package JavaCore;
import java.util.*;
public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seat number : ");
		String seat = sc.next();
		if(seat.equalsIgnoreCase("Regular")) {
			System.out.println("You have selected regular seat and cost is - 80");
		}
		else if(seat.equalsIgnoreCase("Premium")) {
			System.out.println("You have selected premium seat and cost is - 100");
		}
		else if(seat.equalsIgnoreCase("EXECUTIVE")) {
			System.out.println("You have selected Executive seat and cost is - 120");
		}
		else if(seat.equalsIgnoreCase("VIP")) {
			System.out.println("You have selected VIP seat and cost is - 140");
		}
		else {
			System.out.println("Error!!!Select the seat correctly");
		}

	}

}
