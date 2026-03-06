/*Teena having elements as 10,10,10,10,20,20,20,20,40,40,50,50,30 and she
maintained in the data structure “my_record”. She needs to find the frequency of
element in my_report and display the count.*/

package HandsOn2;
import java.util.*;
public class ArrayM5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int record[] = {10,10,10,10,20,20,20,20,40,40,50,50,30};

        boolean visited[] = new boolean[record.length];

        System.out.println("Element   Frequency");

        for(int i = 0; i < record.length; i++) {

            if(visited[i])
                continue;

            int count = 1;

            for(int j = i + 1; j <record.length; j++) {
                if(record[i] == record[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(record[i] + " 	" + count);
        }
	}

}
