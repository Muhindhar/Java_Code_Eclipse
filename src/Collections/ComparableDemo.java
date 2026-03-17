package Collections;
import java.util.*;
import java.io.*;
class mobile implements Comparable<mobile>{
	private String name;
	private int ram;
	private int price;
	public mobile(String name, int ram, int price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getRam() {
		return ram;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int compareTo(mobile o ) {
		if(this.ram < o.getRam()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	class priceCompare implements Comparator<mobile>{
		public int compare(mobile m1,mobile m2) {
			if(m1.getPrice() < m2.getPrice()) return -1;
			if(m1.getPrice() > m2.getPrice()) return 1;
			else return 0;
		}
	}
	class nameCompare implements Comparator<mobile>{
		public int compare(mobile m1, mobile m2) {
			return m1.getName().compareTo(m2.getName());
		}
	}
	
}
public class ComparableDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<mobile> mobilelist = new ArrayList<>();
		mobilelist.add(new mobile("Apple",8,100));
		mobilelist.add(new mobile("Redme",16,800));
		mobilelist.add(new mobile("Samsung",4,600));
		Collections.sort(mobilelist);
		System.out.println("Sorted by price");
	//	priceCompare priceCompare = new priceCompare();
		Collections.sort(mobilelist, new priceCompare() );
		System.out.println("Mobiles after sorting :");
		System.out.println("Name  "+"\t" + "Ram  " +"\t"+ "Price  "+"\t");
		for(mobile mb : mobilelist) {
			System.out.println(mb.getName() + "\t" +
			mb.getRam() + "\t" + mb.getPrice());
		}
	}

}
