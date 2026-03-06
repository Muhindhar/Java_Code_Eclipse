package Oops;
abstract class shape{
	void draw() {
		System.out.println("Drawing");
	}
	abstract void area();
	abstract void perimeter();
}
 class rectangle extends shape{
	private int leng,bre;
	rectangle(int leng,int bre){
		this.bre = bre;
		this.leng = leng;
	}
	@Override
	void area() {
		System.out.println("The area of the rectangle is :" +leng*bre);
		
	}
	@Override
	void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of the rectangle is  : "+(2*(leng+bre)));
		
	}	
}
 class square extends shape{
	 private int side;
	 square(int side){
		 this.side = side;
	 }
	 @Override
	 void area() {
		// TODO Auto-generated method stub
		 System.out.println("The area of the square is : "+side*side);		
	 }
	 @Override
	 void perimeter() {
		// TODO Auto-generated method stub
		 System.out.println("The perimeter of the squre is : "+4*side);
	 }
 }
 
 class triangle extends shape{
	 private int base,ht,side;
	 
	 triangle(int base,int ht,int side){
		 this.base = base;
		 this.ht = ht;
		 this.side = side;
	 }
	 @Override
	 void area() {
		// TODO Auto-generated method stub
		 System.out.println("The area of the triangle : "+((1/2)*base*ht));
		
	 }

	 @Override
	 void perimeter() {
		// TODO Auto-generated method stub
		 System.out.println("The perimeter of the triangle is :"+base+ht+side );
	 }
 }
 
 class circle extends shape{
	 private int rad;
	 circle(int rad){
		 this.rad  = rad;
	 }
	 @Override
	 void area() {
		// TODO Auto-generated method stub
		 System.out.println("Area od circle : "+3.14*rad*rad);
		
	 }
	 @Override
	 void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of circle : "+2*3.14*rad);
	 }
	 
 }
public class Abstraction_Example_Shapes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle(22);
		c.area();
		c.perimeter();
		triangle t = new triangle(1,2,3);
		t.area();
		t.perimeter();
		square s = new square(5);
		s.area();
		s.perimeter();
	}
}