package com.pits.automationtraining.inheritance;

public class SalaryClass3 extends SalaryClass2{
	double total;
	double totalSal;
	public SalaryClass3()
	{
		super();
	}
	public void calculateTotalSalarypackage()
	{
		total = (basicPay + bonusAmt) - hra;
		totalSal = total - deductionAmt - pf;
	}
	public void calculateSalarySlip()
	{
		System.out.println("Basic Pay : "+basicPay);
		System.out.println("HRA (5% of Basic Pay) : "+hra);
		System.out.println("PF (20% of Basic Pay) : "+pf);
		System.out.println("Bonus : "+bonusAmt);
		System.out.println("Deductions : "+deductionAmt);
		System.out.println("Total Salary : "+totalSal);
	}
	public static void main(String[] args) {
		SalaryClass3 salarySlip = new SalaryClass3();
		salarySlip.getSalaryDetails();
		salarySlip.calculateHRAandPF();
		salarySlip.calculateTotalSalarypackage();
		salarySlip.calculateSalarySlip();

	}

}
