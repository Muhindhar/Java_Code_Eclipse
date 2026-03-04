package Oops;
import java.util.*;
public class Practice_emplyer {
		int id;
		String name;

		public void setDetails(int id,String name) {
			this.id = id;
			this.name = name;
		}
		public void setName(String name) {
			
		}
		void display() {
			System.out.println("Employee details");
			System.out.println("Id : "+id);
			System.out.println("Name : "+name);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			Practice_emplyer  a = new Practice_emplyer ();
			a.setDetails(s.nextInt(), s.next());
			a.display();
			a.setDetails(s.nextInt(), s.next());
			a.display();
			
		}
	

	}