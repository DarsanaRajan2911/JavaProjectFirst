package com.pits.automationtraining.aggregation;

public class Author {
	String authorName;
	int authorAge;
	String authorPlace;
	public void getAuthorInfo(String authorName, int authorAge,  String authorPlace)
	{
		System.out.println("Author Name : "+authorName);
		System.out.println("Author Age : "+authorAge);
		System.out.println("Author Pleace : "+authorPlace);
	}
}
