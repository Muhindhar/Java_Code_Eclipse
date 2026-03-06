package Digital_payment;
import java.util.*;
public class Netbanking extends Payments{

	String bankname;
	String accnumber;
	String ifsccode;


	
		public Netbanking(String transid, double amount, String customername, String bankname,
			String accnumber, String ifsccode) {
		super(transid, amount, customername);
		this.bankname = bankname;
		this.accnumber = accnumber;
		this.ifsccode = ifsccode;
	}

		public  boolean Validatepayment() {
			if(accnumber.length()==16 && bankname.isEmpty()==false && 
					 ifsccode.length()==11) {
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
