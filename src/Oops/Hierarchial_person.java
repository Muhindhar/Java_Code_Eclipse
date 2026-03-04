package Oops;

class Person {
    String name;
    String address;

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

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
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

    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address +
                ", program=" + program + ", year=" + year +
                ", fee=" + fee + "]";
    }
}

// Staff class
class Staff extends Person {
    String school;
    double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff [name=" + name + ", address=" + address +
                ", school=" + school + ", pay=" + pay + "]";
    }
}

public class Hierarchial_person {

    public static void main(String[] args) {
    	Student b = new Student("Muhi", "Gugai", "Training", 2026, 20000);
    	System.out.println(b);

        Staff a = new Staff("Muhindhar", "Salem", "KIOT", 50000);
        System.out.println(a);

    }
}