/*Write a program to find the duplicate number
 *  on a given integer array*/
package HandsOn2;
import java.util.*;
public class ArrayE6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int in = sc.nextInt();
		int arr[] = new int[in];
	
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]);
					break;
				}
		}
		
		}
	}

}
