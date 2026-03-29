package Oops;

class A {
    void run1() {
        System.out.println("Vehicle is running");
    }
}

class B extends A {
    void walk() {
        System.out.println("I am walking");
    }
}

public class Upcasting {
    public static void main(String[] args) {

        A obj = new B();   

        obj.run1();        

        B obj2 = (B) obj; 
        obj2.walk();       
    }
}