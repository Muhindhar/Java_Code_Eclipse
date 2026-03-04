package JavaCore;
import java.util.*;
public class CtflE1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Wage per day: ");
	        double wage = sc.nextDouble();
	        System.out.print("Enter Number of days worked: ");
	        int days = sc.nextInt();
	        double totalSalary = wage * days;

	        System.out.println("\nEmployee Name: " + name);
	        System.out.println("Total Salary: " + totalSalary);
	    }
	}


