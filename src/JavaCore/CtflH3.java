/*3.	Ana planned to choose the four digit lucky number for
 * her car. Her lucky numbers are 3, 5 and 7. Help her to\
 *  find the number, whose sum is divisible by 3 or 5 or 7. 
 *  Provide a valid car number, Fails to provide a valid input
 *   then display that number is not a valid car number.*/
package JavaCore;

import java.util.*;

public class CtflH3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the car no: ");
		int num = sc.nextInt();
		if (num <1000||num > 9999) {
			System.out.println(num + "is not a valid car number");
		} else {
			int sum = 0;
			int temp = num;

			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
				System.out.println("Lucky Number");
			} else {
				System.out.println("Sorry it’s not my lucky number");
			}
		}
	}
}
