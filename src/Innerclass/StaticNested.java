package Innerclass;
class person{
	int age =21;
	static int wt = 48;
	static class gender{
		static void nonStaticDisplay() {
			System.out.println("In nonStatic display method");
			System.out.println("Weight value :"+wt);
		}
		
		static void staticDisplay() {
			System.out.println("In static display method");
			System.out.println("Weight value : "+wt);
		}
	}
	gender gen = new gender();
}
public class StaticNested {
	public static void main(String[] args) {
		person p = new person();
		person.gender.nonStaticDisplay();
		person.gender.staticDisplay();
	}
}
