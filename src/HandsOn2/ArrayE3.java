
/*Find max or min value in an array of primitives using C#.*/
package HandsOn2;
import java.util.*;
public class ArrayE3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		System.out.println("Enter the sorting order : ");
		String so = sc.next();
		
		if(so.equalsIgnoreCase("Max")) {
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum element is  : "+ max);
		}
		else {
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum element is  : "+ min);
		}
	}
}
