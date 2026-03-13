package JavaCore;

public class Assertions {

	public static void main(String[] args) {
        int age = 4;
        assert age >= 18 : "Age must be 18 or above";
        System.out.println("Eligible to vote");
    }

}
