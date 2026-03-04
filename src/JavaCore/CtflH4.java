package JavaCore;
import java.util.*;
public class CtflH4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int amount = sc.nextInt();
		int dis;
		if(amount<2000) {
			dis = (int) (amount*0.05); ;
			System.out.println(amount-dis);
		}
		else if(amount>2000 && amount<5000) {
			System.out.println(amount*0.75);
		}
		else if(amount>5000 && amount<10000) {
			System.out.println(amount*0.65);
		}
		else {
			System.out.println(amount*0.50);
		}
	}
}
