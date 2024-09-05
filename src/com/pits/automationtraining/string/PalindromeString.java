package com.pits.automationtraining.string;
//To check whether the given strings are palindrome or not
public class PalindromeString {

	public static void main(String[] args) {
		PalindromeString result = new PalindromeString();
		result.findReverse("Malayalam");
		result.findReverse("Java");

	}
	public void findReverse(String str)
	{
		String lowerStr = str.toLowerCase(); //Converting to lowercase
		StringBuffer sbf = new StringBuffer(lowerStr);//String buffer
		sbf.reverse();
		String reversedString = sbf.toString();
		if(lowerStr.equals(reversedString))
		{
			System.out.println("The given word "+str+" is palindrome.");
		}
		else
		{
			System.out.println("The given word "+str+" is not palindrome.");
		}
	}

}
