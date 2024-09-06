package com.pits.automationtraining.staticmethod;

public class PlaindromeNumberUsingStaticMethod {

	public static void main(String[] args) {
		//int number= 121;
		int number = Integer.parseInt(args[0]);
		//PalindromeNumber status= new PalindromeNumber();
		int result= PlaindromeNumberUsingStaticMethod.identifyPalindromeNumber(number);
		
		if (result==1) 
		{
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }	

	}
	public static int identifyPalindromeNumber(int number)
	{
		int reverse = reverseofNumber(number);
		if(number==reverse)
		{
			return 1;
		}
		else
		{
			return 2;
		}			
	}
	public static int reverseofNumber(int number)
	{
		int reversedNumber=0;
		while (number != 0) 
		{
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
		return reversedNumber;
	}	

}
