/*Write a program to count a total number of duplicate and unique elements in the
given array.*/
package HandsOn2;
import java.util.*;

public class ArrayM3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        int dup = 0,uni = 0;
        for(int i = 0; i < s; i++) {
            int count = 0;
            for(int j = 0; j < s; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > 1) {
                boolean fir = true;

                for(int k=0;k<i;k++) {
                    if(arr[k] ==arr[i]) {
                        fir = false;
                        break;
                    }
                }
                if(fir) {
                    dup++;
                }
            }
            else{
                uni++;
            }
        }
        System.out.println("No of duplicate element: " + dup);
        System.out.println("No of unique elements: " + uni);
    }
}
