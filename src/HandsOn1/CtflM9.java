package HandsOn1;
import java.util.*;
public class CtflM9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		int org = a;
		int sum=0;
		while(a>0) {
			int rem = a%10;
			sum+=rem*rem*rem;
			a/=10;
		}
		if(sum==org) {
			System.out.println("Armstrong number ");
		}
		else {
			System.out.println("Not a armstrong number ");
		}
	}
}
