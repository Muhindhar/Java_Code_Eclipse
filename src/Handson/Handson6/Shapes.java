package Handson6;
abstract class  shape{
	protected String color = "red";
	protected boolean filled = true;
	
    public shape() {}
    
public shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
public String getColor() {
	return color;
	}

public void setColor(String color) {
	this.color = color;
	}
public boolean isFilled() {
	return filled; 
	}
public void setFilled(boolean filled) { 
	this.filled = filled; 
	}
public abstract double getArea();
public abstract double getPerimeter();

@Override
public String toString() {
	return "shape [color=" + color + ", filled=" + filled + "]";
	}
}
class circle extends shape{
	protected double radius = 1.0;
	protected circle() {};
	public circle(double radius) {
		this.radius = radius;
	}
	public circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return "circle [radius=" + radius + "]";
	}
}

class rectangle extends shape{
	protected double width = 1.0;
    protected double length = 1.0;
    
    public rectangle() {};
    
    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() { 
    	return width; 
    	}
    public void setWidth(double width) {
    	this.width = width; 
    	}

    public double getLength() {
    	return length;
    	}
    public void setLength(double length) { 
    	this.length = length;
    	}

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[" + super.toString() +
                ",width=" + width + ",length=" + length + "]";
    }
}
class Square extends rectangle {

    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			circle c = new circle(5, "blue", true);
	        System.out.println(c);
	        System.out.println("Area: " + c.getArea());
	        System.out.println("Perimeter: " + c.getPerimeter());

	        rectangle r = new rectangle(4, 6, "green", false);
	        System.out.println("\n" + r);
	        System.out.println("Area: " + r.getArea());
	        System.out.println("Perimeter: " + r.getPerimeter());

	        Square s = new Square(3, "yellow", true);
	        System.out.println("\n" + s);
	        System.out.println("Area: " + s.getArea());
	        System.out.println("Perimeter: " + s.getPerimeter());   
	}
}
