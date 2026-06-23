package HandsOn1;
import java.util.*;

public class CtflE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inp = sc.next().charAt(0);

        inp = Character.toLowerCase(inp);

        if (Character.isLetter(inp)) {
            switch (inp) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("The given is vowel");
                    break;
                default:
                    System.out.println("It is a consonant");
            }
        } else {
            System.out.println("Symbol");
        }
    }
}
