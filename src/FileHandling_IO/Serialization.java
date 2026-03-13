package FileHandling_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob = new Employee(1,"muhi");
		String filname = "file.ser";
		try {
			FileOutputStream file = new FileOutputStream(filname);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(ob);
			out.close();
			file.close();
			System.out.println("Object has been serialzed");
		}
		catch(IOException ex){
			System.out.println(ex);
			}
		Employee ob1 = null;
		try {
			FileInputStream file = new FileInputStream(filname);
			ObjectInputStream in = new ObjectInputStream(file);
			ob1 = (Employee)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized");
			System.out.println("Employee id  : "+ob1.empid+"\nEmployee name "+ob1.empname );
		}
		 catch (IOException e) {
	            System.out.println(e);
	        }
		catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
	

}
