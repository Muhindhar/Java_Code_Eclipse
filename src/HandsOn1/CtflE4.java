package HandsOn1;
import java.util.*;
public class CtflE4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s  = sc.nextInt();
		int sum=0;
		int n=1;
		do {
			sum+=s;
			n++;
		}
		while(n<=s);
		System.out.println(sum+1);
	}
}
