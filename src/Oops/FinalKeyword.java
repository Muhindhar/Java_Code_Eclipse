package Oops;

class a{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	class b extends a{
		void add(int a,int  b) {
			System.out.println("The result : "+(a+b));
		}
	}
	
}
public class FinalKeyword {

	final double pi=3.14159;
	public void sample() {
		pi = 3.14;
	}
		
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		a m = new b();
		m.add(6, 3);
		System.out.println(obj.pi);
	}
}
