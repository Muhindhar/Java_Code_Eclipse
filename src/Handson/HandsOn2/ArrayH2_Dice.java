/*Arun and Naveen are playing a dice game. Each one will get one chance to roll the
dice. Dice values are recorded in two different tables. After 10 turns, the winner has
to be decided by calculating each value recorded in each table.
*/
package HandsOn2;
import java.util.*;
public class ArrayH2_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		int sum1=0,sum2=0;
		System.out.println("Enter the 10 numbers of 1st person : ");
		for(int i=0;i<10;i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the 10 numbers of 2nd person : ");
		for(int i=0;i<10;i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			sum1+=arr1[i];
		}
		for(int i=0;i<10;i++) {
			sum2+=arr1[i];
		}
		if(sum1>sum2) {
			System.out.println("Arun wins!!");
		}
		else {
			System.out.println("Naveen wins!!");
		}
	}

}
