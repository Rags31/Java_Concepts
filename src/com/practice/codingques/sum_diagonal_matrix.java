package com.practice.codingques;

import java.util.*;
public class sum_diagonal_matrix {
	
	

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<Integer> list=new ArrayList<Integer>();
		//int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of matrix  : ");
		int m_count=sc.nextInt();
		for (int k=1;k<=m_count;k++)
		{
		System.out.println("Enter Row length for matrix "+k+"  : ");
		int row=sc.nextInt();
		System.out.println("Enter column length for matrix "+k+" : ");
		int column=sc.nextInt();
		int a[][]=new int[row][column];//declaration    	 
		System.out.print("Enter " + row*column + " Elements to Store in Array :\n");
	        for (int i = 0; i < row; i++)
	    {
		    for(int j = 0; j < column; j++)
		    {
	           	a[i][j] = sc.nextInt();
		    }
		}   
		int i=0,j=0;
		System.out.println("Matrix Formation : ");
		for (i=0;i<row;i++)
		{
			for (j=0;j<column-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(a[i][j]);
		}
		
		//Sum of Diagonal Matrix
		
				int sum=0;
				   for (i = 0; i < row; i++)
				    {
					    for(j = 0; j < column; j++)
					    {
					    	if (i==j)
					    	{
					    		sum=sum+a[i][j];
					    	}
					    }
					}
				   
				   
				   list.add(sum);
				   System.out.println("Sum of Diagonal Matrix "+k+" : "+sum);

		
		
	}
		
		System.out.println("Matrix "+(Collections.binarySearch(list, Collections.max(list))+1)+" has max sum between the given matrices");
		
		
				   		
		
	}

}
