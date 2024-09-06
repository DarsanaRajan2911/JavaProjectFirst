package com.pits.automationtraining.basicjavapgm;
//Swap two numbers by using temp variables
public class SwapWithVariable {

	public static void main(String[] args) {
		int a = 13;
		int b = 10;
		int var = a + b;
		a = var - a;
		b = var - b;
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
	}

}
