package com.pits.automationtraining.inheritance;

import java.util.Scanner;

public class SalaryClass1 {
	double basicPay;
	double deductionAmt;
	double bonusAmt;
	
	public void getSalaryDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic pay");
		this.basicPay = sc.nextDouble();
		
		System.out.println("Enter deduction");
		this.deductionAmt = sc.nextDouble();
		
		System.out.println("Enter bonus");
		this.bonusAmt = sc.nextDouble();
	}

}
