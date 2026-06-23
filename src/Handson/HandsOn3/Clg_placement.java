/*2.	XYZ college wants to recognize the department which has
 *  succeeded in getting the maximum number of placements for 
 *  this academic year. The departments that have participated
 *   in the recruitment drive are CS, EC, ME. Help the college 
 *   to find the department getting maximum placements.*/
package HandsOn3;
import java.util.*;
public class Clg_placement {
public static void plcmt(int cs,int ec,int me) {
	if(cs<=0 && ec<=0 && me<=0) {
		System.out.println("Input is invalid");
	}
	
		if(cs>=ec && cs>=me) {
			System.out.println("Highest Placement CS");
		}
		
		if(ec>=cs && ec>=me) {
			System.out.println("Highest Placement EC");
		}
		 if(me>=cs && me>=ec) {
			System.out.println("Highest placement ME");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS:");
		int cs = sc.nextInt();
		System.out.println("Enter the no of students placed in EC:");
		int ec = sc.nextInt();
		System.out.println("Enter the no of students placed in ME:");
		int me = sc.nextInt();
		plcmt(cs,ec,me);
		
	}

}
