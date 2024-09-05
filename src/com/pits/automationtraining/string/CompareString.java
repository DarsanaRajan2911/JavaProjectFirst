package com.pits.automationtraining.string;

public class CompareString {

	public static void main(String[] args) {
		CompareString cm = new CompareString();
		cm.compareFunction("Darsana", "Darsana");
		cm.compareFunctionIngnoreCase("Darsana", "DARSANA");
		cm.compareEqualEqual("Abhi", "Abhinand");

	}
	public void compareFunction(String str1, String str2)
	{
		if(str1.equals(str2))
		{
			System.out.println("String1 and String2 are equal");
		}
		else
		{
			System.out.println("String1 and String2 are not equal");
		}
	}
	public void compareFunctionIngnoreCase(String str1, String str2)
	{
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("String1 and String2 are equal (case-insensitive).");
		}
		else
		{
			System.out.println("String1 and String2 are not equal (case-insensitive).");
		}
	}
	public void compareEqualEqual(String str1, String str2)
	{
		if(str1 == str2)
		{
			System.out.println("String1 and String2 are equal");
		}
		else
		{
			System.out.println("String1 and String2 are not equal");
		}
	}

}
