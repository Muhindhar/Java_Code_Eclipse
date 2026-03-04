/*There are N friends in a group. Each of them has Xi chocolates. Write a program to
check whether they can share all of these chocolates among themselves such that
each one of them has equal number of chocolates.
*/
package JavaCore;
import java.util.*;
public class ArrayH1_Chocolate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of persons : ");
		int per = sc.nextInt();
		int arr[] = new int[per];
		int sum=0;
		for(int i=0;i<per;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<per;i++) {
			sum+=arr[i];
		}
		if(sum%per==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}
}
