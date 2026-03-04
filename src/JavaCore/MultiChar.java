package JavaCore;
import java.util.*;
public class MultiChar {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[][] arr= {{"B","B","B","A","A"},{"A","A","A","B","B"}};
		int vip=0,premium=0,regular=0,vipp=5,
				premiumm=10,regularr=5;
		System.out.println("------Seat Arrangement------");
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				System.out.println("---VIP SEATS---");
			}
			else if(i==1) {
				System.out.println("---PREMIUM SEATS---");
			}
			else if(i==2) {
				System.out.println("---REGULAR SEATS---");
			}
			for (int j=0; j < arr[i].length; j++) {
				System.out.print(" "+arr[i][j]+"   ");
				if(i==0 && arr[i][j].equalsIgnoreCase("B"))	
				vip++;
				else if(i>0 && i<3 && arr[i][j].equalsIgnoreCase("B"))
					premium++;
				else if(i==3 && arr[i][j].equalsIgnoreCase("B"))
					regular++;
			}	
			System.out.println();
		}
		System.out.println("----SEAT BOOKED DETAIL----");
		System.out.println("-------REGUAR SEATS------");
		System.out.println(regularr);
		System.out.println("-------PREMIMUM SEATS------");
		System.out.println(premiumm);

		System.out.println("--------VIP SEATS--------");
		System.out.println("BOOKED : "+vip+" AVAILABLE : "+(vipp-vip)+" TOTAL : "+vipp);
		System.out.println("-----PREMIUM SEATS-----");
		System.out.println("BOOKED : "+premiumm+" AVAILABLE : "+(premiumm - 
				premium)+" TOTAL : "+premiumm);
		
	}
}
