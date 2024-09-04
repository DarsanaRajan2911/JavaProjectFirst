package com.pits.automationtraining.collections;
//ArrayList<String> color = new ArrayList<String>();
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Violet");
		color.add("Indigo");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Orange");
		color.add("Red");
		Iterator<String> its = color.iterator();
		while(its.hasNext())
		{
			System.out.println(its.next());
		}

	}

}
