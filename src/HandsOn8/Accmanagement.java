package HandsOn8;
import java.util.*;

class PayOutOfBoundsException extends Exception {
 public PayOutOfBoundsException(String msg) {
     super(msg);
 	}
}

class AccountManagement {
 double bal = 10000;  
 final double MAX_LIMIT = 3000;

 void checkForDebit(double amount) throws PayOutOfBoundsException {

     if(amount > MAX_LIMIT) {
         throw new PayOutOfBoundsException("Transaction exceeds maximum limit of 30000");
     }

     if(amount > bal) {
         throw new PayOutOfBoundsException("Insufficient balance");
     }
 }
     void withdrawAmount(double amount) throws PayOutOfBoundsException {
     checkForDebit(amount);

     bal = bal - amount;
     System.out.println("Withdrawal successful");
     System.out.println("Remaining Balance: " + bal);
 }
}

public class Accmanagement {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     AccountManagement acc = new AccountManagement();
     System.out.println("Enter withdrawal amount:");
     double amount = sc.nextDouble();
     try {
         acc.withdrawAmount(amount);
     }
     catch(PayOutOfBoundsException e) {
         System.out.println(e.getMessage());
     	}
 	}
}