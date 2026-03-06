package Digital_payment;
import java.util.*;
public  class UPIpayment extends Payments {

	String upiid;
	String upipin;
	
	
	

	public UPIpayment(String transid, double amount, String customername,  String upiid,
			String upipin) {
		super(transid, amount, customername);
		this.upiid = upiid;
		this.upipin = upipin;
	}

	//abstract
		public boolean Validatepayment() {
			if(upiid.contains("@") && upipin.length()==4) {
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
