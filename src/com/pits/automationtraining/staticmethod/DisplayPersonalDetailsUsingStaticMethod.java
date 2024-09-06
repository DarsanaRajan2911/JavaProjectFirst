package com.pits.automationtraining.staticmethod;

public class DisplayPersonalDetailsUsingStaticMethod {

	public static void main(String[] args) 
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		DisplayPersonalDetailsUsingStaticMethod.displayDetails(name, age);

	}
	public static void displayDetails(String name, int age)
	{
		System.out.println("The candidate name is " +name+ " and " +age+ " years old");
		
	}

}
