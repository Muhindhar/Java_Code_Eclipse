package HandsOn5;

import java.util.*;

public class Permanent_empl extends Empl_Payroll {
	double bonus;

	public Permanent_empl(String empid, String empname, double basesal, double bonus) {
		super(empid, empname, basesal);
		this.bonus = bonus;
	}

	public double calsal() {
		return basesal + bonus;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
