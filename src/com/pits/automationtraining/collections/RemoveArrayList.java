package com.pits.automationtraining.collections;

import java.util.ArrayList;
//WAP to remove the third element from a array list.
public class RemoveArrayList {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Violet");
		color.add("Indigo");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Orange");
		color.add("Red");
		System.out.println("Colors list before removing third element"+color);
		color.remove(3);
		System.out.println("Colors list after removing third element"+color);
	}

}
