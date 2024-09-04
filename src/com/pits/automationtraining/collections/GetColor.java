package com.pits.automationtraining.collections;
//WAP to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;

public class GetColor {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Violet");
		color.add("Indigo");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Orange");
		color.add("Red");
		System.out.println(color.get(1));

	}

}
