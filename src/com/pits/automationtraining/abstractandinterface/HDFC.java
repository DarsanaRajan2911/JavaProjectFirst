package com.pits.automationtraining.abstractandinterface;

public class HDFC implements RBI{

	@Override
	public double recurringDeposit(double amount, int duration) {
		double rate = INTEREST_RATE;
		double totalAmount = amount * Math.pow(1 + rate / 12, duration);
		return totalAmount;
	}
	public static void main(String args[])
	{
		HDFC hdfc = new HDFC();
		double amount = 1000;
		int duration = 12;
		double totalAmount = hdfc.recurringDeposit(amount, duration);
		System.out.println("Total amount after depositing "+amount+" for "+duration+" months : "+totalAmount);
	}
}
