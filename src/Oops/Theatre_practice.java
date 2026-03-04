package Oops;
import java.util.*;
public class Theatre_practice {
	int id;
	String name;
	String des;
	Theatre_practice(int id,String name,String des){
		this.id = id;
		this.name = name;
		this.des = des;
		
		System.out.println("Enter the theatre details ");
		System.out.println("Theatre id :"+id);
		System.out.println("Thetare name : "+name);
		System.out.println("Thetare description : "+des);
	}
			public static void main(String[] args) {
				Theatre_practice inp = new Theatre_practice(101,"T4742","SPI Cinemas");
	
		
	}
}
