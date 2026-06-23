package HandsOn1;
import java.util.*;
public class CtflM4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the timing in hours");
		int timeh = sc.nextInt();
		System.out.println("Enter the timing in minutes");
		int timem = sc.nextInt();
		int res;
		if(timeh>7) {
			System.out.println("User can only browse maximum 7 hrs");
		}
		else if(timeh==5) {
			res = 200+timem;
			System.out.println("Bill amount = :"+res);
		}
		else {
		int hr =  timeh*50;
		int min = timem*1;
		 res = hr+min;
		System.out.println(res);
		}

	}

}
