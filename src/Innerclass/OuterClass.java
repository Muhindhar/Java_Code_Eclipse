package Innerclass;
class outerclass{
	int age = 16;
	public void checkage() {
		System.out.println("In checkage() method call");
	}
	class innerclass{
		public void show() {
			System.out.println("In show() method call of inner class");
		}
	}
}
public class OuterClass {
	public static void main(String[] arfs) {
		outerclass outer = new outerclass();
		System.out.println("Outer class.age: "+ outer.age);
		System.out.println("Outer class checkage()");
		outer.checkage();
		outerclass.innerclass inner = outer.new innerclass();
		System.out.println("Inner class method calls");
		inner.show();
	}
}
