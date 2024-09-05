package com.pits.automationtraining.string;

public class StringLength {

	public static void main(String[] args) {
		StringLength strl = new StringLength();
		strl.findStringLength("PIT Solutions Pvt Ltd");
		strl.findStringLength("Automation upskill session");

	}
	public void findStringLength(String str)
	{
		int len = str.length();
		System.out.println("Length of the string '"+str+"' is "+len);
	}

}
