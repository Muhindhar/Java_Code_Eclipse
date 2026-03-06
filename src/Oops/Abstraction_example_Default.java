package Oops;
interface Shape{
    double DEFAULT_VALUE = 1.0;

    double calarea();
    double calperi();

    default String getdes() {
        return "A shape with unspecified dimension";
    }
}
abstract class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = DEFAULT_VALUE;
    }

    public double calperi() {
        return 2 * Math.PI * radius;
    }

    public String getdes() {
        return "A circle with radius " + radius;
    }
}

class Dem implements Shape{

    public double calarea() {
        return 0;
    }

    public double calperi() {
        return  
    }
}

public class Abstraction_example_Default {

    public static void main(String[] args) {

        Dem c = new Dem();

        System.out.println(c.calarea());
        System.out.println(c.calperi());
        System.out.println(c.getdes());
    }
}