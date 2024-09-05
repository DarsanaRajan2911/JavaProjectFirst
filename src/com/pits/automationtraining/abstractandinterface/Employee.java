package com.pits.automationtraining.abstractandinterface;

abstract class Employee {
	public double paymentPerHour;
	public double workingHour;
	abstract void calculateSalary(double paymentPerHour, double workingHour);
	
	public Employee(double paymentPerHour, double workingHour)
	{
		this.paymentPerHour = paymentPerHour;
		this.workingHour = workingHour;
	}
}
