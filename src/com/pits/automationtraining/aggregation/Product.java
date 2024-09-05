package com.pits.automationtraining.aggregation;

public class Product {
	int id;
	String name;
	String description;
	public void getProductInfo(int id, String name, String description) {
		System.out.println("Product Id : "+id);
		System.out.println("Product Name : "+name);
		System.out.println("Product Description : "+description);
	}
}
