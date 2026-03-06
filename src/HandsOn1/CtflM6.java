package HandsOn1;
import java.util.*;
public class CtflM6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price amount");
		int pr = sc.nextInt();
		int dis;
		if(pr>1000) {
			dis = (int) (pr*0.10);
			System.out.println(" 10% discount is applied : "+(pr-dis));
		}
		else if(pr>500) {
			dis = (int) (pr*0.5);
			System.out.println("5% discount is applied : "+ (pr-dis));
		}
		else {
			System.out.println("There is no offer : "+pr);
		}

	}

}
