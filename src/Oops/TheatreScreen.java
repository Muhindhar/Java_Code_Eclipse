package Oops;
import java.util.*;
public class TheatreScreen {
	private static int totseat = 20;
	TheatreScreen(){
		System.out.println("Current seat availability : "+totseat);
	}
	public void DisplayTheatreScreen() {
		System.out.println("Current seat avail : "+totseat);
	}
	public static void BookTicket(int nooftick) {
		System.out.println("No. of seats booked : "+ nooftick);
	}
	public static void main(String[] args) {
		System.out.println("Screen ticket availability status : ");
		TheatreScreen Ts1 = new TheatreScreen();
		Ts1.BookTicket(4);
		TheatreScreen Ts2 = new TheatreScreen();
		Ts2.BookTicket(5);
		Ts2.DisplayTheatreScreen();
	}
}
