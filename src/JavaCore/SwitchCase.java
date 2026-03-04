package JavaCore;
import java.util.*;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter character");
		char inp = sc.next().charAt(0);
		switch(inp) {
		case 'a':
			System.out.println("Lowercase Letter");
			break;
		case 'A':
			System.out.println("Uppercase letter");
			break;
			
		}
	}
}
