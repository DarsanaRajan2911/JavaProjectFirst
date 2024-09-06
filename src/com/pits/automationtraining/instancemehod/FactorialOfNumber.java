package com.pits.automationtraining.instancemehod;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int number = 4;
		FactorialOfNumber fact = new FactorialOfNumber();
		int factorial_no = fact.calculateFactorial(number);
		System.out.println("Factorial of given number "+number+" is "+factorial_no);

	}
	public int calculateFactorial(int number)
	{
		int factorial = 1;
		for(int i=1; i<=number; i++)
		{
			factorial *= i;
		}
		return factorial;
	}
}
