package com.pits.automationtraining.abstractandinterface;

public class FullTimeEmployee extends Contractor
{
	public FullTimeEmployee(double paymentPerHour) {
		super(paymentPerHour, 8);
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour * 8;
	}
	public static void main(String args[])
	{
		Contractor contractor = new Contractor(100, 24);
		System.out.println("Contractor salary : Rs."+contractor.calculateSalary());
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(40);
		System.out.println("Full Time Employee Salary : Rs."+fullTimeEmployee.calculateSalary());
	}

}
