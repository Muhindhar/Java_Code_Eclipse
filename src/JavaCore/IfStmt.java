package JavaCore;
import java.util.*;
public class IfStmt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ismoving = true;
		int speed  = 20;
		if(ismoving) {
			System.out.println(speed);
		}
		else {
			System.out.println("Not moving");
		}
	}
}
