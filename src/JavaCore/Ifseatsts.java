package JavaCore;
import java.util.*;
public class Ifseatsts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean seatavail = true; //false
		System.out.println("Enter the seat number : ");
		String seat = sc.next();
		if(seatavail) {
			System.out.println("You have booked the seat : "+seat);
		}
		else {
			System.out.println("Not available");
		}
	}
}
