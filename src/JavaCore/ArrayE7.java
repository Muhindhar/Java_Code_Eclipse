/*Write a program to merge two arrays into a third array. 
 * Display the values of three arrays*/
package JavaCore;
import java.util.*;
public class ArrayE7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size ");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("enter the elements : ");
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size ");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		System.out.println("enter the elements : ");
		for(int i=0;i<n2;i++) {
			arr2[i] = sc.nextInt();
		}
		int arr3[] = new int[n1+n2];
		
		for(int i=0;i<n1;i++) {
			arr3[i] = arr1[i];
		}
		for(int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }
		
		 System.out.println("\nFirst Array:");
	        for(int x : arr1) {
	            System.out.print(x + " ");
	        }
	        
	     System.out.println("\nSecond Array:");
	     for(int x : arr2) {
	     System.out.print(x + " ");
	        }
	     
	     System.out.println("Merged array : ");
	     for(int x : arr3) {
	    	 System.out.println(x + " ");
	     }
	}

}
