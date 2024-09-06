package com.pits.automationtraining.instancemehod;

public class EligibleForVote {

	public static void main(String[] args) {
		int age = 19;
		EligibleForVote vote = new EligibleForVote();
		String status = vote.voteEligibility(age);
		if(status.equals("true"))
		{
			System.out.println("This candidate is eligible for vote");
		}
		else {
			System.out.println("This candidate is not eligible for vote");
		}

	}
	public String voteEligibility(int age)
	{
		if(age >= 18)
		{
			return "true";
		}
		else
		{
			return "false";
		}
	}

}
