package com.pits.automationtraining.aggregation;

public class Book {
	String bookName;
	int bookPrice;
	Author at; //Aggregation
	public void getBookDetails()
	{
		at = new Author();
		at.getAuthorInfo("Bala Subramanium", 65, "Tamil Nadu");
		System.out.println("Book Name : "+bookName);
		System.out.println("Book Price : "+bookPrice);
	}
	public static void main(String[] args) {
		Book bk = new Book();
		bk.bookName = "Java";
		bk.bookPrice = 1500;
		bk.getBookDetails();
	}

}
