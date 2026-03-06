package Oops;

public class Main_Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fr1
		Empl_Payroll e = new Empl_Payroll("101", "Muhindhar", 1000);
		System.out.println("Details are"+e.toString());
		//fr3
		Empl_Payroll c = new ContractEmpl("101", "Muhindhar", 1000,11.1,22.9);
		System.out.println(c.toString());
		//fr4
		Internempl i = new Internempl("101", "Muhindhar", 1000,12000);
		System.out.println(i.toString());
		//fr2
		Permanent_empl p = new Permanent_empl("101", "Muhindhar", 1000,110);
		System.out.println(p.toString());
	}

}
