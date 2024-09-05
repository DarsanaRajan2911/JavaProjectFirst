package com.pits.automationtraining.encapsulation;

import java.util.Scanner;

public class User {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		
		System.out.println("Enter your pin to withdraw money : ");
		int pin = scanner.nextInt();
		bank.setPinNo(pin);
		System.out.println("Enter the amount to withdraw");
		double amount = scanner.nextDouble();
		bank.withdraw(pin, amount);
		scanner.close();
	}
}
