package com.pits.automationtraining.inheritance;

public class CheckDivisible extends AdditionResult{

	public static void main(String[] args) {
		
		CheckDivisible obj = new CheckDivisible();
		if(obj.add() % 10 == 0)
		{
			System.out.println(obj.add()+" is divisible by 10");
		}
		else {
			System.out.println(obj.add()+" is not divisible by 10");
		}
	}
	public int add()
	{
		return super.add();
	}

}
