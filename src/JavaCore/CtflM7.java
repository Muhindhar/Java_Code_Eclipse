package JavaCore;
import java.util.*;
public class CtflM7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		double hra,da,gross;
		if(salary<10000) {
			hra = salary*0.20;
			da = salary*0.80;
		}
		else if(salary<=2000) {
			hra = salary*0.25;
			da= salary*0.90;
		}
		else {
			hra = salary*0.30;
			da = salary*0.95;
		}
		gross = salary+hra+da;
		System.out.println("Gross salary : "+ gross);
	}
}
