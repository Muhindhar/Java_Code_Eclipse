/*4.	Write a function to find whether the blood donor is eligible or not for donating blood. The rules laid down are as follows.
a.	Age should be above 18 yrs but not more than 55 yrs.
b.	Weight should be more than 45kg.
*/
package HandsOn3;
import java.util.*;
public class BloodDonor {
public static void blood(int age,int wt) {
	if(age>18 && age<=55 && wt>45) {
		System.out.println("Eligible to donate blood");
	}
	else {
		System.out.println("Not eligible");
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age");
	int age = sc.nextInt();
	System.out.println("Enter the weight");
	int wt = sc.nextInt();
	blood(age,wt);
}

}
