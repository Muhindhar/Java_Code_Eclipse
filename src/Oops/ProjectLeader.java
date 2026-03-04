package Oops;
import java.util.*;
class parent {
	String proleadname = "Muhindhar";
	int empid = 27;
	void display() {
		System.out.println("Employee name : "+proleadname);
		System.out.println("Employee Id : "+empid);
	}
}

class program extends parent{
	String proname;
	int empid;
	
	void setData(String name,int id) {
		 this.proname = name;
		 this.empid = id ;
	}
	void display() {
		super.display();
		System.out.println(proname);
		System.out.println(empid);
	}
}
public class ProjectLeader{
	public static void main(String[] args) {
		program pg = new program();
		pg.setData("Krishna", 0);
		pg.display();
	}
}
