/*Write a program that reads continuously a month number 
 * (1 = Jan, 12 = Dec), the day that the month begins (1 = Mon,
 *  7 = Sun), and displays the calendar for that month. If the 
 *  selected month is February, the program should prompt the 
 *  user to enter the month’s number of days, that is, 28 or 29.
 *   If the given month is out of [1, 12], the program should 
 *   terminate.*/
package HandsOn1;
import java.util.*;
public class CtflM5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   while(true) {
			   System.out.print("Enter month (1-12): ");
		       int month = sc.nextInt();
		           if(month < 1 || month > 12) {
		              System.out.println("Invalid month. Program terminated.");
		              break;
		            }
		            System.out.print("Enter starting day (1=Mon ... 7=Sun): ");
		        int start = sc.nextInt();
		        int days = 31;

		       if(month==4 || month==6 || month==9 || month==11)
		    	   days = 30;
		            else if(month==2){
		                System.out.print("Enter days in February (28 or 29): ");
		                days = sc.nextInt();
		            }
		            System.out.println("\nMon Tue Wed Thu Fri Sat Sun");
		            for(int i=1;i<start;i++)
		                System.out.print("    ");
		            for(int d=1; d<=days; d++){
		                System.out.printf("%-4d", d);
		                if((d+start-1)%7==0)
		                    System.out.println();
		            }
		            System.out.println("\n");
		        }
		    }
	}
