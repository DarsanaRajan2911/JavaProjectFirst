package com.pits.automationtraining.string;
//Join two strings
public class JoinStrings {

	public static void main(String[] args) {
		JoinStrings join = new JoinStrings();
		join.joinTwoStrings("Darsana", "Rajan");
		join.joinTwoStrings("Kozhen", "cherry");
		join.joinTwoStrings("Pathanam", "thitta");
	}
	public void joinTwoStrings(String str1, String str2)
	{
		StringBuffer bf = new StringBuffer(str1);
		bf.append(str2);
		String appendedStr = bf.toString();
		System.out.println("Appended string is "+appendedStr);
	}

}
