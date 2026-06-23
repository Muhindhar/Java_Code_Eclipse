/*2.Write a function to find the prime numbers between 1 to 100.*/
package HandsOn3;
import java.util.*;
public class PrimeNumbers {
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
