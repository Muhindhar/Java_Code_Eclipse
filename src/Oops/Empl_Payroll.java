package Oops;

import java.util.*;

public class Empl_Payroll {
	String empid;
	String empname;
	double basesal;

	public Empl_Payroll(String empid, String empname, double basesal) {
		this.empid = empid;
		this.empname = empname;
		this.basesal = basesal;

	}

	public Empl_Payroll(int i, String empname2, int basesal2, int bonus) {
		// TODO Auto-generated constructor stub
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getBasesal() {
		return basesal;
	}

	public void setBasesal(double basesal) {
		this.basesal = basesal;
	}

	public double calsal() {
		return basesal;
	}

	@Override
	public String toString() {
		return "Empl_Payroll [empid=" + empid + ", empname=" + empname + ", Salary + "+calsal()+"]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
