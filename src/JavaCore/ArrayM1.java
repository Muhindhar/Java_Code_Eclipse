/*1. Write a program to check whether a specific element 
 * is present in this Array or not.*/
package JavaCore;
import java.util.*;
public class ArrayM1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key");
		int key = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(key==arr[i]) {
				System.out.println("True");
			}
		}
		
	}
}
