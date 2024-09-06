package com.pits.automationtraining.instancemehod;

public class DiscountForCustomer {
	double array[] = {1000.0, 2000.0, 3000.0, 4000.0, 5000.0};
	public static void main(String[] args) {
		
		DiscountForCustomer dis = new DiscountForCustomer();
		double total = dis.calculateTotalAmount(); // Method for calling calculate total
		double discount = dis.checkDiscount(total); //Method for calling check discount availability
		if(discount != 0)
		{
			System.out.println("Congratulations! Discount is available ... Total amount is "+total+" and discount amount is "+discount);
		}
		else
		{
			System.out.println("Sorry! You don't have discount for this purchase");
		}
	}
	public double calculateTotalAmount()
	{
		double sum = 0;
		for(int i = 0; i < array.length ; i++)
		{
			sum+= array[i];
		}
		return sum;
	}
	public double checkDiscount(double total)
	{
		if(total > 500)
		{
			double discountPercentage = 0.2; //20% discount
			double discountAmount = total * discountPercentage;
			double discountedPrice = total - discountAmount;
			return discountedPrice;
		}
		else
		{
			return 0;
		}
	}

}
