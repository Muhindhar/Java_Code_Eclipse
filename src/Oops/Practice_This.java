package Oops;
import java.util.*;

public class Practice_This {
    int empid;
    String empNam;
    double empsal;

    // parameter constructor
    Practice_This(int empid, String empName, double empsal) {
        this.empid = empid;
        this.empNam = empName;
        this.empsal = empsal;
        System.out.println("Employee record created");
    }

    // default constructor
    Practice_This() {
        this(101, "Muhi", 300000);
        System.out.println("Default constructor called");
    }

    // Using "this" to call another method
    void register() {
        System.out.println("Registering Employee");
        this.display();
    }

    // display 
    void display() {
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Name : " + empNam);
        System.out.println("Employee Salary : " + empsal);
    }

    void sendhr() {
        Hrdept hr = new Hrdept();
        hr.sendhr(this);
    }

    Practice_This updatesal(double hikper) {
        this.empsal = empsal + (empsal * hikper / 100);
        return this;
    }

    Practice_This updname(String newName) {
        this.empNam = newName;
        return this;
    }

    class Hrdept {
        void sendhr(Practice_This e) {
            System.out.println("HR department processing employee :");
            System.out.println("Processed Employee : " + e.empNam +
                    " with salary " + e.empsal + "\n");
        }
    }

    public static void main(String[] args) {

        Practice_This emp = new Practice_This();  
        emp.register();

        // method chaining
        emp.updname("Rahul").updatesal(10);

        System.out.println("\nAfter Update:");
        emp.display();

        emp.sendhr();
    }
}
