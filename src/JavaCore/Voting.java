package JavaCore;
import java.util.*;
public class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter the weight : ");
		int wt = sc.nextInt();
		if(age>18) {
			if(wt>50) {
				System.out.println("Eligible to donate blood");
			}
			else {
				System.out.println("You are under weight and not eligible to donate blood");
			}
		}
		else {
			System.out.println("You are under age and not eligible to donate blood");
		}
	}
}
