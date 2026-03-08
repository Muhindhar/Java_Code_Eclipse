package Handson6;
class customer{
	String name;
	String city;
	public customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "customer [name=" + name + ", city=" + city + "]";
	}
}

class account{
	int accno;
	double bal;
	public account(int accno, double bal) {
		super();
		this.accno = accno;
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "account [accno=" + accno + ", bal=" + bal + "]";
	}
}
class rbi{
	customer c;
	account a;
	rbi(customer c, account a) {
        this.c = c;
        this.a = a;
    }
	public double getInterestRate() {
        return 4.0;
    }

    public double getWithdrawalLimit() {
        return 50000;
    }

    public void display() {
        System.out.println(c);
        System.out.println(a);
    }
}
class sbi extends rbi {

    sbi(customer c, account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 5.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 100000;
    }
}
class icici extends rbi {

    icici(customer c, account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 6.0;
    }

    @Override
    public double getWithdrawalLimit() {
        return 150000;
    }
}
class pnb extends rbi {

    pnb(customer c, account a) {
        super(c, a);
    }

    @Override
    public double getInterestRate() {
        return 4.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 75000;
    }
}

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer cust = new customer("Muhindhar", "Salem");
        account acc = new account(12345, 50000);

        rbi bank;   

        bank = new sbi(cust, acc);
        System.out.println("\n--- SBI ---");
        bank.display();
        System.out.println("Interest Rate: " + bank.getInterestRate());
        System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());

        bank = new icici(cust, acc);
        System.out.println("\n--- ICICI ---");
        bank.display();
        System.out.println("Interest Rate: " + bank.getInterestRate());
        System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());

        bank = new pnb(cust, acc);
        System.out.println("\n--- PNB ---");
        bank.display();
        System.out.println("Interest Rate: " + bank.getInterestRate());
        System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());
    
	}

}
