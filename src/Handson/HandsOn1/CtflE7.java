package HandsOn1;
import java.util.*;

public class CtflE7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter the weight");
		int wt = sc.nextInt();
		if(age>18 && age<55 && wt>45) {
			System.out.println("Eligible to donate blood");
		}
		else {
			System.out.println("Not eligible to donate");
		}
	}
}
