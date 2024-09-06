package com.pits.automationtraining.instancemehod;

public class DisplayPersonalInfo {

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		DisplayPersonalInfo dt = new DisplayPersonalInfo();
		dt.displayPersonalDetails(name,age);

	}
	public void displayPersonalDetails(String name, int age)
	{
		System.out.println("Name of the candidate is "+name+" and "+age+" years old");
	}

}
