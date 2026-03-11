package HandsOn7;
import java.util.*;
public class Remspace {
	static void mytrim(String s) {
		int start = 0;
		int end = s.length()-1;
		char arr[] = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			
		if(arr[i]==' ') {
			start++;
		}
		else {
			break;
		}
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(arr[i]==' ') {
				end--;
			}
			else {
				break;
			}
		}
		for(int i=start;i<end;i++) {
			System.out.print(arr[i]);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		mytrim(sc.nextLine());
	}

}
