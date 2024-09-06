package com.pits.automationtraining.constructor;

public class ReverseofNumberUsingConstructor {
	int number, reverse_number, remainder;
	public static void main(String[] args) {
		ReverseofNumberUsingConstructor rev = new ReverseofNumberUsingConstructor();
	}
	public ReverseofNumberUsingConstructor(int number) //calculation
	{
		this.number = number;
		reverse_number = 0;
		while(number !=0)
		{
			remainder = number % 10;
			reverse_number = reverse_number * 10 +remainder;
			number = number / 10;
		}		
	}
	public ReverseofNumberUsingConstructor() //Display
	{
		this(123);
		//this(532);
		System.out.println("Reverser of the number "+number+" is "+reverse_number);
	}

}
