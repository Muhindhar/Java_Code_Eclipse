package HandsOn5;

import java.util.*;

public class ContractEmpl extends Empl_Payroll {
	double taxrate;
	double sercharge;

	public ContractEmpl(String empid, String empname, double basesal,double taxrate,double sercharge) {
		super(empid, empname, basesal);
		this.sercharge = sercharge;
		this.taxrate = taxrate;
		
		// TODO Auto-generated constructor stub
	}

	public double calsal() {
		return (basesal - (basesal * taxrate) - sercharge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
