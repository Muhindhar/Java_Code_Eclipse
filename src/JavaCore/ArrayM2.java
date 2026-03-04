/*2.	Roll the dice 100 times and display the frequency 
 * of each number rolled using arrays.*/
package JavaCore;
import java.util.*;
public class ArrayM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] freq = new int[6];
		 for (int i = 0; i < 100; i++) {
			 int roll = (int)(Math.random() * 6) + 1;
			 if (roll == 1) freq[0]++;
			 else if (roll == 2) freq[1]++;
			 else if (roll == 3) freq[2]++;
			 else if (roll == 4) freq[3]++;
			 else if (roll == 5) freq[4]++;
			 else if (roll == 6) freq[5]++;
		 }
		 for (int i = 0; i < 6; i++) {
			 System.out.println("Number " + (i + 1) + " occurred " + freq[i] + " times");
		 }
	
	}

}
