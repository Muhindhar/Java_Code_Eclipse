/*1.Numbers and Alphabets has equivalent ASCII values i.e
 *  Numbers (0 to 9) equivalent ASCII value is 48 to 57,
 *   uppercase alphabet (A to Z) equivalent ASCII value is 65 
 *   to 90 and lowercase alphabet (a to z) equivalent ASCII 
 *   value is 97 to 120. Write a program to sort numbers 0 to
 *    9, alphabets in upper and lowercase using equivalent 
 *    ASCII values*/
package HandsOn1;
import java.util.*;
public class CtflH1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] arr = a.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<a.length();i++) {
		System.out.println(arr[i]);
		}
	}
}
