/*1.	XYZ Technologies is in the process of increment the salary of the employees. This increment is done based on their salary and their performance appraisal rating.
a.	If the appraisal rating is between 1 and 4, the increment is 10% of the salary.
b.	If the appraisal rating is between 4.1 and 7, the increment is 25% of the salary.
c.	If the appraisal rating is between 7.1 and 10, the increment is 30% of the salary. */
package Functions;
import java.util.*;
public class Xyz_salary {
public static void sal(float sal,float rat) {
	if(rat>1 && rat<5) {
		System.out.println((sal*0.10)+sal);
	}
	else if(rat>5 && rat<7) {
		System.out.println((sal*0.25)+sal);
	}
	else if(rat>7 && rat<10) {
		System.out.println((sal*0.30)+sal);
	}
	else {
		System.out.println("Invalid input");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary : ");
		float sal = sc.nextFloat();
		System.out.println("Enter the rating : ");
		float rat = sc.nextInt();
		sal(sal,rat);
	}

}
