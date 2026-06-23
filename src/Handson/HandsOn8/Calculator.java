package HandsOn8;

import java.util.Scanner;

class Mycalculator{
	long power(int n, int  p) throws Exception{
		if(n<0 || p<0) {
			throw new Exception("n or p should not be negative");
		}
		if(n==0 || p==0) {
			throw new Exception("n or p should not be zero");
		}
		return (long) Math.pow(n, p);
		}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Mycalculator c = new Mycalculator();

		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("Enter p value : ");
		int p =sc.nextInt();
					
			try {
				System.out.println(c.power(n, p));
			}
			catch(Exception e){
				System.out.println(e);
			}
	}

}
