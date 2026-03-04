package JavaCore;
import java.util.*;
public class ConversionImplicit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 100;
		long l = i;
		float f = l;
		System.out.println("int val : "+i);
		System.out.println("Float val : "+f);
		System.out.println("Long val : "+l);
		//Promotion
		byte d = 5;
		d =(byte)( d*2);
		System.out.println(d);
		
	}
}
