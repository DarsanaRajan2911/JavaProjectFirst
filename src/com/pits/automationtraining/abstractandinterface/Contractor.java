package com.pits.automationtraining.abstractandinterface;

public class Contractor extends Employee{

	public Contractor(double paymentPerHour, double workingHour) {
		super(paymentPerHour, workingHour);
		// TODO Auto-generated constructor stub
	}
	public double calculateSalary()
	{
		return paymentPerHour * workingHour;
	}
	@Override
	void calculateSalary(double paymentPerHour, double workingHour) {
		// TODO Auto-generated method stub
		
	}
	
}
