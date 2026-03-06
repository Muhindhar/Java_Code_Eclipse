/*3.Get the salary per month and hike from user and the write a C# 
 * program to calculate new salary with hike.*/
package HandsOn3;
import java.util.*;
public class Salary {
public static float  hike(int sal,int hike) {
	int res = sal+(sal*hike)/100;
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the old salary : ");
		int sal = sc.nextInt();
		System.out.println("Enter the hike");
		int hike = sc.nextInt();
		System.out.println("The new salary is : "+hike(sal,hike));
				
	}

}
