package Oops;
import java.util.*;
public class Practice {
	int thid = 4567;
	String thname = "INOX";
	String thloc = "Kochi";
	
	public void display() {
		System.out.println("Theatre Id"+ thid);
		System.out.println("Theatre Name : "+thname);
		System.out.println("Theatre location : "+thloc);
	}
	public static void main(String[] args) {
		Practice a = new Practice();
		Practice b = new Practice()
		a.display();
	}
}

