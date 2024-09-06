package com.pits.automationtraining.array;
//Add two matrices
public class AddTwoMatrices {

	public static void main(String[] args) {
		int array_one[][] = {{1,2,3},
				{4,5,6},
				{7,8,9}};
				
		int array_two[][] = {{10,20,30},
						{40,50,60},
						{70,80,90}};
						
		int sum[][]=new int[3][3]; 
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				sum[i][j]=array_one[i][j]+array_two[i][j];    
				System.out.print(sum[i][j]+" ");    
			}
			System.out.println();
		}

	}

}
