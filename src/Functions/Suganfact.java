/*3.The employees working in Sugan Factory are paid Rs.15.00 
 * per hour if they work overtime for more than 40 hours. 
 * Consider that the employees do not work for fractional 
 * part of an hour. Write a C program to calculate overtime
 *  pay for 5 employees*/
package Functions;
import java.util.*;
public class Suganfact {
public static void sal(int hr) {
	if(hr>40) {
		System.out.println((hr-40)*15);
	}
	else {
		System.out.println("No hike");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("Enter the hour of "+ i + " employees");
			int hr = sc.nextInt();
			
			sal(hr);
		}
		System.out.println();
	}

}
