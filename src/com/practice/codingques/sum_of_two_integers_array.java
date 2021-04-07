package com.practice.codingques;


import java.util.*;

public class sum_of_two_integers_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {5,7,1,2,8,4,3};
		System.out.println("Given Array"+a);
		List<Integer> list=new ArrayList(Arrays.asList(a));
		int tsum=10;
		for (int i=0;i<list.size();i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				
				if (a[i]+a[j]==tsum)
				{
					System.out.println(a[i]+","+a[j]);
				}
				
			}
			
		}
		
	}

}
