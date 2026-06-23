package HandsOn7;
import java.util.*;
public class RemDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String input = sc.nextLine();
		boolean isdup = false;
		char t = '0';
		char arr[] = input.toCharArray();
		for(int i=0;i<input.length();i++) {
			int count =0;
			for(int j=i+1;j<input.length();j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					arr[j] = t;
				}	
			}
			if(arr[i]!='0') {
				System.out.print(arr[i]);
			}
		}
	}
}
