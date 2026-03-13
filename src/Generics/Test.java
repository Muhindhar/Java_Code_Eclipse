package Generics;
class dem<T,U,R>{
	T ob1;U ob2;R ob3;
	dem(T ob1, U ob2, R ob3){
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}
	public void print() {
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dem<String, Integer, Float> obj = new dem<>("Muhi",27,3.15f);
		obj.print();
	}
}
