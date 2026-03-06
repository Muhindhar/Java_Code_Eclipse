package HandsOn1;
import java.util.*;
public class CtflM2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the price of the product");
		int a = sc.nextInt();
		if(a>500) {
			float
			res = (float) (a*0.15);
			System.out.println("The final payable amount :"+(a-res));
		}
		else {
			System.out.println("The final payable amount :" + a);
		}
	}
}
