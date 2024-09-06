package com.pits.automationtraining.staticmethod;

public class FactorialofNumberUsingStaticMethod {

	public static void main(String[] args) 
	{
		int number = Integer.parseInt(args[0]);
		int factorial_no = FactorialofNumberUsingStaticMethod.calculateFactorial(number);
		System.out.println("Factorial of given number "+number+ " is " +factorial_no);

	}
	public static int calculateFactorial(int number)
	{
		int factorial = 1;
		for (int i=1; i<=number; i++)
		{
			factorial *= i;
		}
		return factorial;
	}

}
