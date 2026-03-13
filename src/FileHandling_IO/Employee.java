package FileHandling_IO;

public class Employee implements java.io.Serializable {
	public int empid;
	public String empname;
	//transient means making the value 0 or null...
	public Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}
	
}
