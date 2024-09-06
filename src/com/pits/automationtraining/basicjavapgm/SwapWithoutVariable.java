package com.pits.automationtraining.basicjavapgm;

public class SwapWithoutVariable {
	//Swap two numbers without temp variable and print number before and after swap
	public static void main(String[] args) {
		int a = 13;
		int b = 10;
		System.out.println("The value of a = "+a+" and b = "+b+" before swap");
		a = a + b; // 13+10=23
		b = a - b; // 23-10=13
		a = a - b; //23-13=10
		System.out.println("The value of a = "+a+" and b = "+b+" after swapping");
	}

}
