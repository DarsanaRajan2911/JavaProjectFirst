package com.pits.automationtraining.collections;

import java.util.ArrayList;
import java.util.Scanner;

//WAP to search an element in a array list.
public class SearchArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<String>();
		color.add("Violet");
		color.add("Indigo");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Orange");
		color.add("Red");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color name to search in the list");
		String clr =sc.nextLine();
		if(color.contains(clr))
		{
			System.out.println(clr+" is present in the list");
		}
		else
		{
			System.out.println(clr+ "is not present in the list");
		}
		sc.close();
	}

}
