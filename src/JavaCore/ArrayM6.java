/*Mark enters randomly twenty five numbers from the keyboard and stores it into an
array. He wants to search if the number is present in the array and if it is present, he
needs to display the number of times it appears in the array. */

package JavaCore;
import java.util.*;
public class ArrayM6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[25];
		int count=0;
		System.out.println("Enter 25 numbers : ");
		for(int i=0;i<25;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key : ");
		int key = sc.nextInt();
		
		for(int i=0;i<25;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(count);
		}
		else {
			System.out.println("error");
		}
	}

}
