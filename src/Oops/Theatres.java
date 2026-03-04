package Oops;
import java.util.*;
public class Theatres {
	
		int id;
		String name;
		int screans;
		String location;

		public void setDetail(int id, String name,int screans,String location) {
			this.id = id;
			this.name = name;
			this.screans=screans;
			this.location=location;
		}

		void display() {
			System.out.println("Theatre details ");
			System.out.println("Id : " + id);
			System.out.println("Name : " + name);
			System.out.println("Total Screans : "+screans);
			System.out.println("Location "+location);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			Theatres a[] = new Theatres[5];
			for (int i = 0; i < 5; i++) {
				a[i] = new Theatres();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter theatre details " + (i + 1));
				int id = s.nextInt();
				String name = s.next();
				int screans=s.nextInt();
				String location=s.next();
				a[i].setDetail(id, name,screans,location);
			}
			for (int i = 0; i < 5; i++) {
				a[i].display();
			}

	}

}
