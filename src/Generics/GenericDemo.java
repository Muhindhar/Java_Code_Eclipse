package Generics;
class Demo<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
public class GenericDemo {
	public static void main(String[] args) {
		Demo<Integer> io = new Demo<Integer>();
		io.set(24);
		System.out.println(io.get());
		
		Demo <String> sio = new Demo<String>();
		sio.set("Muhindhar");
		System.out.println(sio.get());
	}
}
