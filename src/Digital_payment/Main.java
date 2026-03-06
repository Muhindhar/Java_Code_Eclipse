package Digital_payment;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//TODO Auto-generated method stub
		System.out.println("Enter the mode of payment");
		String mode = sc.nextLine();
		
		Random r = new Random();
		
		switch(mode) {
		
		case "CreditCard":
		System.out.println("Enter the Amount : ");
		double amt = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the customer name : ");
		String name = sc.nextLine();
		System.out.println("Enter the Account number : ");
		String acc = sc.nextLine();
		System.out.println("Enter the CVV number : ");
		String cvv = sc.nextLine();
		System.out.println("Enter the expiry year : ");
		String exp = sc.nextLine();
		System.err.println("Credit Card Status");
		
		CreditCard c  = new CreditCard(String.valueOf(r.nextInt()),amt,name,acc,cvv,exp);
		System.out.println("Payment details ");
		c.executeTransaction();
		break;
		
		
		case "UPIpayment":
		
		System.out.println("Enter the Amount : ");
		double amt1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the customer name : ");
		String name1 = sc.nextLine();
		System.out.println("Enter the UPI Id : ");
		String ifsc = sc.nextLine();
		System.out.println("Enter the UPI pin number : ");
		String pin = sc.nextLine();
		
		UPIpayment u = new UPIpayment(String.valueOf(r.nextInt()),amt1,name1,ifsc,pin);
		System.err.println("UPI payment details  ");
		u.executeTransaction();
		break;


		case "Netbanking":
			System.out.println("Enter the Amount : ");
			double amt2 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the customer name : ");
			String name2 = sc.nextLine();
			System.out.println("Enter the bank name :");
			String bname = sc.nextLine();
			System.out.println("Enter the account number :");
			String acc2 = sc.nextLine();
			System.out.println("Enter the IFSC code : ");
			String ifsc2 = sc.nextLine();
			System.err.println("Netbanking payment status");
			
			Netbanking n = new Netbanking (String.valueOf(r.nextInt()),amt2,name2,bname,acc2,ifsc2);
			System.out.println("Netbanking payment details  ");
			n.executeTransaction();
			break;	
		}
	}
}
