/*1.Write a C# program to find the sums of the 
 * running odd numbers and even numbers from a given 
 * lowerbound to an upperbound. Also compute their absolute 
 * difference. (Use separate function to find the sum of 
 * odd and even numbers from lowerbound to upperbound)*/
package HandsOn3;
import java.util.*;
public class RunningoddEven {
public static void run(int a,int b) {
	int sum1=0,sum2=0;
	for(int i=a;i<=b;i++) {
		if(i%2==0) {
			sum1+=i;
		}
		else {
			sum2+=i;
		}
	}
	System.out.println("The sum of odd num : "+sum1);
	System.out.println("The sum of even num :"+sum2);
	System.out.println(Math.abs(sum1-sum2));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int a = sc.nextInt();
		System.out.println("Enter the ending number : ");
		int b = sc.nextInt();
		run(a,b);
	}

}
