/*8.	Write a program to find the missing number in 
 * a given integer array of 1 to 100.*/
package HandsOn2;
import java.util.*;
public class ArrayE8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      int freq[]=new int[256];
	      System.out.println("Enter the numbers : ");
	      for(int i=0;i<arr.length;i++) {
	    	  arr[i]=sc.nextInt();
	    	  freq[arr[i]]++;
	      }
	      System.out.println("Missing Numbers:");
	      for(int i=1;i<=n;i++) {
	    	  if(freq[i]==0) {
	    		  System.out.println(i);
	    	  }
	      }
	      
		
	}

}
