package com.pits.automationtraining.staticmethod;

public class EligibleforVoteUsingStaticMethod {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
        //EligibleVoteUsingInstanceMethod vote = new EligibleVoteUsingInstanceMethod();
        String status = EligibleforVoteUsingStaticMethod.voteEligibility(age);
        
        
        if (status.equals("true")) 
		{
            System.out.println("This candidate is eligible for vote");
        } 
		else 
		{
            System.out.println("This candidate is not eligible for vote");
        }
	}
	public static String voteEligibility(int age) 
	{
        if (age >= 18) 
		{
            return "true";  
        } 
		else 
		{
            return "false"; 
        }
    }

}
