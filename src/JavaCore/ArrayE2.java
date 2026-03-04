
/*Write a program to sort the elements of an array in sequence*/
package JavaCore;
import java.util.*;
public class ArrayE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {12,99,32,11,33,43,87};
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			
				System.out.print(arr[i]+" ");
			
		}
			
}
}