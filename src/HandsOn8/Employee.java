package HandsOn8;
import java.util.*;
import java.time.*;

class InvalidEmpNumberException extends Exception {
    public InvalidEmpNumberException(String msg) {
        super(msg);
    }
}
class InvalidDateOfJoinException extends Exception {
    public InvalidDateOfJoinException(String msg) {
        super(msg);
    }
}

class EmployeeTest {

    int empCode;
    String name;
    LocalDate dob;
    LocalDate doj;
    EmployeeTest(int empCode, String name, LocalDate dob, LocalDate doj) {
        this.empCode = empCode;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    void display() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Date of Appointment: " + doj);

        int experience = Period.between(doj, LocalDate.now()).getYears();
        System.out.println("Years of Experience: " + experience);
    }
}
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Employee Code:");
            int code = sc.nextInt();
            sc.nextLine();
            if(code <= 0) {
                throw new InvalidEmpNumberException("Employee code must be a positive integer");
            }
            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();
            System.out.println("Enter Date of Birth (yyyy-mm-dd):");
            LocalDate dob = LocalDate.parse(sc.nextLine());

            System.out.println("Enter Date of Appointment (yyyy-mm-dd):");
            LocalDate doj = LocalDate.parse(sc.nextLine());
            if(!dob.isBefore(doj)) {
                throw new InvalidDateOfJoinException("Date of birth must be before date of appointment");
            }
            EmployeeTest emp = new EmployeeTest(code, name, dob, doj);
            emp.display();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
