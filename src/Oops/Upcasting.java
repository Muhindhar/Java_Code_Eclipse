package Oops;

class a{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class b extends a{
	void walk() {
		System.out.println("I am walking");
	}
}


public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a m = new a();
		b n = new b();
		m.run();
		n.walk();

	}

}
