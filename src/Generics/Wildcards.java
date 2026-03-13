package Generics;
import java.util.*;
public class Wildcards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		double sum = sum(ints);
		System.out.println("Sum of ints : "+sum);
	}
	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}
	

}
