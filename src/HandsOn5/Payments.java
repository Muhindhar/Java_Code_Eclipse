package HandsOn5;
import java.util.*;
public abstract class Payments {

	String transid;
	double amount;
	String customername;
	String paymentsts;
	
	
	public Payments(String transid, double amount, String customername) {
		
		this.transid = transid;
		this.amount = amount;
		this.customername = customername;
	}
	public abstract boolean Validatepayment();
	
	public abstract boolean Processpayment();
	

	public  void executeTransaction() {
		if (Validatepayment()) {
			  if (Processpayment()) {
			  setPaymentsts("Success");
			 } else {
			  setPaymentsts("Failed");
			 }
			  
		}
		else {
			setPaymentsts("Validation Failed");
		}
		generateReceipt();
	}
	
	public  void generateReceipt() {
		System.out.println("The transaction id : "+transid);
		System.out.println("The Amount : "+ amount);
		System.out.println("The banker name is :" + customername);
		System.out.println("Payment status : "+paymentsts);
		
	}
	public String getTransactionId() {
		return transid;
	}
	
	public double getAmount() {
		return amount;
	}
	public String PaymentStatus() {
		return paymentsts;
	}
	
	public String getPaymentsts() {
		return paymentsts;
	}
	public void setPaymentsts(String status) {
		this.paymentsts = status;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
