/*Ivan has a list of n elements and he need to eliminate 
 * the duplicate numbers from the list and to create the 
 * new list to hold the unique number*/
package HandsOn2;
import java.util.*;
public class ArrayM4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i = 0; i < s; i++) {
          arr[i] = sc.nextInt();
          }
        int uni[] = new int[s];
        int count=0;
		   for(int i = 0; i < s; i++) {
			   boolean found = false;
		            for(int j = 0; j < count; j++) {
		                if(arr[i] == arr[j]) {
		                    found = true;
		                    break;
		                }
		            }
		            if(!found) {
		                boolean fir = true;
		                uni[count] = arr[i];
		                count++;
		              
		            }
		        }
		        System.out.println("unique elements: " + uni);
		    for(int i=0;i<count;i++) {
		    	System.out.println(uni[i]+ " ");
		    }

	}
}
