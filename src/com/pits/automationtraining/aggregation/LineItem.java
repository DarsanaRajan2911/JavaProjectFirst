package com.pits.automationtraining.aggregation;

public class LineItem {
	int quantity;
	Product pdct;
	public void getProductDetails()
	{
		pdct = new Product();
		pdct.getProductInfo(123, "Loreal Paris", "Cosmetic product from Loreal Paris");
		System.out.println("Product Quantity : "+quantity);
	}
	public static void main(String[] args) {
		LineItem lt = new LineItem();
		lt.quantity = 10;
		lt.getProductDetails();

	}

}
