/*Write a function to Calculate the Sum of Odd & Even Numbers*/
package Functions;
import java.util.*;
public class OddEven {
	public static String odev(int a) {
		if(a%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		System.out.println(odev(a));
	}
}
