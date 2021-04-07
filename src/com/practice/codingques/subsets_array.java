package com.practice.codingques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets_array {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a[]= {3,5,7};
		int total=a.length;
		int limit=(int)Math.pow(2, total);
		
		
		for (int i=0;i<limit;i++)
		{
			String set = "";
			int temp=i;
			for (int j=0;j<a.length;j++)
			{
				
				int r=temp%2;
				temp=temp/2;
				
				
				if (r==0)
				{
					set=set+"-";
				}
				else
				{
					set=set+a[j];
				}
			}
			
			System.out.println(set);
		}
		
		

	}
}