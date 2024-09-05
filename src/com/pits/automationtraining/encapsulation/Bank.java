package com.pits.automationtraining.encapsulation;

public class Bank {
	private int pinNo;
	private static final int[] validPinNo = {1001, 1234, 1212};
	
	public int getPinNo()
	{
		return pinNo;
	}
	public void setPinNo(int pinNo)
	{
		if(isValidPin(pinNo))
		{
			this.pinNo = pinNo;
			System.out.println("Thank you for entering valid pin number");
		}
		else
		{
			System.out.println("Invalid pin. please enter valid pin.");
		}
	}
	private boolean isValidPin(int pinNo)
	{
		for(int validPin : validPinNo)
		{
			if(validPin ==pinNo)
			{
				return true;
			}
		}
		return false;
	}
	public void withdraw(int pinNo, double amount)
	{
		if(validatePin(pinNo))
		{
			System.out.println("Withdrwal of Rs."+amount+" successful.");
		}
		else
		{
			System.out.println("Invalid pin. Cannot withdraw this amount");
		}
	}
	public boolean validatePin(int pinNo)
	{
		return this.pinNo == pinNo;
	}

}
