package JavaCore;
import java.util.*;
public class CycleSpeed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean speed = true;
		System.out.println("Enter the speed");
		int sp = sc.nextInt();
		if(speed) {
			sp--;
			System.out.println("The speed is reduced : "+ sp);
		}
		else {
			System.out.println("The speed is not reduced");
		}
	}
}
