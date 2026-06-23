/*Write a program to find the frequency of each
 *  element in the array*/
package HandsOn2;
import java.util.*;
public class ArrayE4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int arr[] = new int[10];
		boolean[] done = new boolean[10];
		System.out.println("ENter 10 elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	
		for(int i=0;i<arr.length;i++) {
			if(done[i])
			continue;
			count=1;
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				done[i] = true;
			}
		}
		System.out.println((arr[i] + " occurs " + count + " times"));
		}
		
	}
}
