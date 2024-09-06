package com.pits.automationtraining.constructor;

public class MarkCalculation 
{
	int mark1, mark2, mark3, total_mark;
	public static void main(String args[])
	{
		MarkCalculation object1 = new MarkCalculation(20 , 40 , 30);
		System.out.println("Total mark is " +object1.findTotalMark()+ " and Grade is  : " +object1.findGradeofMark());
		
		MarkCalculation object2 = new MarkCalculation(200 , 400 , 300);
		System.out.println("Total mark is " +object2.findTotalMark()+ " and Grade is  : " +object2.findGradeofMark());				
	}
	public MarkCalculation(int mark1, int mark2, int mark3)
	{
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public int findTotalMark()
	{
		total_mark = mark1 + mark2 + mark3;
		return total_mark;
	}
	public String findGradeofMark()
	{
		int average_mark = total_mark / 3;
		if(average_mark > 80)
		{
			return "A";
		}
		else if(average_mark <= 80 && average_mark > 70)
		{
			return "B";
		}
		else if(average_mark <=70 && average_mark > 60)
		{
			return "C";
		}
		else if(average_mark <=60 && average_mark >40)
		{
			return "D";
		}
		else
		{
			return "E";
		}					
	}	
}
