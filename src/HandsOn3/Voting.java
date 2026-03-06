/*4.A person is elligible to vote if his/her age
 *  is greater than or equal to 18. Define a method to find out if he/she is elligible to vote*/
package HandsOn3;
import java.util.*;
public class Voting {
public static String vote(int age) {
	if(age>18) {
		return "Eligible to vote";
	}
	else {
		return "Not eligible to vote";
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		System.out.println(vote(age));
				
	}

}
