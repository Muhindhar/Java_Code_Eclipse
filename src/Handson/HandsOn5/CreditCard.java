package HandsOn5;
import java.util.*;
public  class CreditCard extends Payments {

	String cardnumber;
	String cvv;
	String expirydate;
	
	

	public CreditCard(String transid, double amount, String customername, String cardnumber,
			String cvv, String expirydate) {
		super(transid, amount, customername);
		this.cardnumber = cardnumber;
		this.cvv = cvv;
		this.expirydate = expirydate;
	}

	
	//abstract
		public  boolean Validatepayment(){
			if(cardnumber.length()==16 && cvv.length()==3) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public  boolean Processpayment() {
			if(Validatepayment()) {
				return true;
			}
			else {
				return false;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
