package JavaCore;
import java.util.*;
public class ColourCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color number : ");
		int clr = sc.nextInt();
		if(clr==1) {
			System.out.println("Red");
		}
		else if(clr==2) {
			System.out.println("Yellow");
		}
		else if(clr==3) {
			System.out.println("Blue");
		}
		else if(clr==4) {
			System.out.println("Orange");
		}
		else {
			System.out.println("RCB");
		}
	}
}
