package Oops;
import java.util.*;
public class Overloading {
		static int add(int a,int b) {
			return a+b;
		}
		static double add(double a,double b) {
			return a+b;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a");
			double a =sc.nextDouble();
			System.out.println("Enter b");
			double b = sc.nextDouble();
			System.out.println(add(a,b));
		}
}