package HandsOn5;

import java.util.*;

public class Internempl extends Empl_Payroll {

	double stipend;

	public Internempl(String empid, String empname, double basesal, double stipend) {
		super(empid, empname, basesal);
		this.stipend = stipend;
		// TODO Auto-generated constructor stub
	}

	public double calsal() {
		return stipend;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
