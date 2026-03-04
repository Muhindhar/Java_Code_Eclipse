/*2.To speed up his composition of generating unpredictable 
rhythms, Aniruth wants the list of prime numbers available in
 a range of numbers. Can you help him out? Write a C# program 
 to print all prime numbers in the interval [x,y] 
 (x and y, both inclusive).(Use separate function to print 
 all prime numbers in the given interval) */
package Functions;
import java.util.*;
public class AniruthPrime {
	public static void prime(int a,int b) {
		for(int n=a;n<=b;n++) {
			if (n<=1) 
				continue;
			boolean isp = true;
			for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isp = false;
				break;
			}
			}
			if(isp) {
				System.out.println(n+ " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value : ");
		int a = sc.nextInt();
		System.out.println("Enter the ending value : ");
		int b = sc.nextInt();
		prime(a, b);
	}

}
