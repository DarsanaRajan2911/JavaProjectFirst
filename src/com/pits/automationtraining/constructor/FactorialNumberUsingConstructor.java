package com.pits.automationtraining.constructor;

public class FactorialNumberUsingConstructor {
	int number, factorial;
	public static void main(String[] args) {
		FactorialNumberUsingConstructor fact = new FactorialNumberUsingConstructor();

	}
	 public FactorialNumberUsingConstructor(int number)  //calculate factorial
	{
        this.number = number;
        factorial = 1; 
        for (int i = 1; i <= number; i++) 
		{
            factorial *= i;
        }
    }

    public FactorialNumberUsingConstructor() //Display factorial
	{
		this(4);
		//this(5);
        System.out.println("Factorial of " +number+ " is " +factorial);
    }

}
