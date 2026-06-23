//Person first class
//student extends person
//staff extends person
package Handson6;
class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
class Student extends Person {

    String program;
    int year;
    double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String toString() {
        return "Student[" + super.toString() +
                ",program=" + program +
                ",year=" + year +
                ",fee=" + fee + "]";
    }
}
class Staff extends Person {
    String school;
    double pay;
    public Staff(String name, String address, String school, double pay) {

        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String toString() {
        return "Staff[" + super.toString() +
                ",school=" + school +
                ",pay=" + pay + "]";
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        Student s = new Student("Muhindhar", "Salem", "ECE", 3, 50000);
        Staff st = new Staff("Muthu", "Chennai", "KIOT", 40000);
        //System.err.println("Person 1 Details");
        System.out.println(s);
      //  System.err.println("Person 2 Details");
        System.out.println(st);
    }
}