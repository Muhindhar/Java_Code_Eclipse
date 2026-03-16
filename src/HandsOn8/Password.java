package HandsOn8;
import java.util.Scanner;
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String msg) {
        super(msg);
    }
}
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) {
        super(msg);
    }
}

public class Password {

    static String defusername = "muhi123";
    static String defups = "Muhi@123";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String usname = sc.next();

        System.out.println("Enter the password");
        String usps = sc.next();

        try {
            validateUsername(usname);
            validateUserpassword(usps);

            if(usname.equals(defusername) && usps.equals(defups)) {
                System.out.println("Welcome " + usname);
            }
            else {
                System.out.println("Invalid username or password");
            }

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateUsername(String usname) throws InvalidUsernameException {
        if(usname.length() < 6 || usname.length() > 30) {
            throw new InvalidUsernameException("InvalidUsernameException");
        }
        if(!usname.matches("[A-Za-z][A-Za-z0-9_]*")) {
            throw new InvalidUsernameException("InvalidUsernameException");
        }
    }
    static void validateUserpassword(String usps) throws InvalidPasswordException {
        if(usps.length() < 8) {
            throw new InvalidPasswordException("InvalidPasswordException");
        }
        if(!usps.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("InvalidPasswordException");
        }
        if(!usps.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("InvalidPasswordException");
        }

        if(!usps.matches(".*[0-9].*")) {
            throw new InvalidPasswordException("InvalidPasswordException");
        }
        if(!usps.matches(".*[!@#$%^&*()\\-+].*")) {
            throw new InvalidPasswordException("InvalidPasswordException");
        }
    }
}