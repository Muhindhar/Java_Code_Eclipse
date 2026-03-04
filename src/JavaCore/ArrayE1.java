/*Write a program to add even and odd numbers from 1 to 10. Store and display their
results in two separate arrays*/
package JavaCore;
import java.util.*;
public class ArrayE1 {
	public static void main(String[] args) {
		int even=0,odd=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
