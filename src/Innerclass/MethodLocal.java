package Innerclass;
class outer{
	int value= 27;
	public void outerclassMethod() {
		System.out.println("Inside the method of outer class");
		class inner{
			public void innerclassmethod() {
				System.out.println("Inside the method of inner class");
				System.out.println("Value : "+value );
			}
		}
		inner in = new inner();
		in.innerclassmethod();
	}
}

public class MethodLocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer out = new outer();
		out.outerclassMethod();

	}

}
