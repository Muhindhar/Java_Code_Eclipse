package HandsOn1;
import java.util.*;
public class CtflE2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		if(n%7==0) {
			System.out.println("The given number is divisible by 7");
		}
		else {
			System.out.println(n + " is not divisible by 7");
		}
	}
}
