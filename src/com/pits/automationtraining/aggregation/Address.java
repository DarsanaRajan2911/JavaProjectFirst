package com.pits.automationtraining.aggregation;

public class Address {
	String address;
	Student std;
	public void getStudentDetails()
	{
		std = new Student();
		std.getStudentInfo("Darsana", 500);
		System.out.println("And her address is "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addrs = new Address();
		addrs.address = "Mannil";
		addrs.getStudentDetails();
	}

}
