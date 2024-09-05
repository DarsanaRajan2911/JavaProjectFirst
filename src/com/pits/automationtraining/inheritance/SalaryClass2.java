package com.pits.automationtraining.inheritance;

public class SalaryClass2 extends SalaryClass1{
	double hra;
	double pf;
	public SalaryClass2()
	{
		super();
	}
	public void calculateHRAandPF()
	{
		this.hra = (0.05) * basicPay;
		this.pf = (0.20) * basicPay;
	}
}
