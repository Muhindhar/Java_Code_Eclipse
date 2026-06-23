package HandsOn1;
import java.util.*;

public class CtflE6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if (a < 0) {
                break; 
            }
            for (int i = 1; i <= a; i++) {
                System.out.println("Hello");
                n++;
            }
        }
        System.out.println("Total number of hello: " +n);
    }
}
