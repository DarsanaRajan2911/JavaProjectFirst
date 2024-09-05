package com.pits.automationtraining.aggregation;

public class Car {
	String color;
	String carName;
	int regNo;
	public void getCarInfo(String color, String carName, int regNo)
	{
		System.out.println("Car Name is "+carName+", color is "+color+" and the registration no is "+regNo);
	}
}
