package com.pits.automationtraining.abstractandinterface;
//System.out.println("Fruits name is Orage");
public class FoodItems implements Animal, Fruits{

	@Override
	public void orange() {
		System.out.println("Fruits name is Orange");
		
	}

	@Override
	public void grapes() {
		System.out.println("Fruits name is Grapes");
		
	}

	@Override
	public void cat() {
		System.out.println("Animal name is cat");
		
	}

	@Override
	public void dog() {
		System.out.println("Fruits name is dog");
		
	}
	public static void main(String args[])
	{
		FoodItems fd = new FoodItems();
		fd.orange();
		fd.grapes();
		fd.cat();
		fd.dog();
	}

}
