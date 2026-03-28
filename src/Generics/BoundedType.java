package Generics;

public class BoundedType {
	static <T extends Number> T genericDisplay(T one,T two) {
		return (T)(Integer)(one.intValue() + two.intValue());
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(genericDisplay(11,5));
		
	}

}
