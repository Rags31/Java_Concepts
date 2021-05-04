package com.practice.codingques;

import java.util.Scanner;

public class transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row length of an array : ");
		int row=sc.nextInt();
		System.out.println("Enter column length of an array : ");
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
		
		
		//Transpose of a Matrix
		   int t[][]=new int[row][column];
		   for (i = 0; i < row; i++)
		    {
			    for(j = 0; j < column; j++)
			    {
			    	t[i][j]=a[j][i];
			    }
			}
		   System.out.println("Transpose Matrix Formation : ");
		   for (i=0;i<row;i++)
			{
				for (j=0;j<column-1;j++)
				{
					System.out.print(t[i][j]+" ");
				}
				System.out.println(t[i][j]);
			}


	}

}
