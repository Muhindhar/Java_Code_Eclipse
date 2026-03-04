/*In a school there are Indian, NRI and Foreigners studying. Their heights are given in
three different values. To represent their class, they need to stand in height order in
a single line. Given three arrays X, Y, Z of different sizes M, N and O, write a
program to merge the three arrays and make it a single sorted array.
*/
package JavaCore;
import java.util.*;
public class ArrayH4_School {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int n1 = sc.nextInt();
		System.out.println("Enter the elements of array 1");
		int arr1[] = new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of array 2");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<n2;i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of array 3");
		int n3 = sc.nextInt();
		int arr3[] = new int[n3];
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<n3;i++) {
			arr3[i] = sc.nextInt();
		}
		int n4 = n1+n2+n3;
		int[] arr4 = new int[n4];
		
		for(int i=0;i<n4;i++) {
			if(i<n1) {
				arr4[i] = arr1[i];
			}
			else if(i<n1+n2) {
				arr4[i] = arr2[i-n1];
			}
			else {
				arr4[i] = arr3[i-n1-n2];
			}
		}
		Arrays.sort(arr4);
		for(int i=0;i<n4;i++)
		System.out.print(arr4[i] + " ");
		
		
	}
		
	
}
