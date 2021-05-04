package com.practice.codingques;

import java.util.*;

public class array_index_value_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer[] a=new Integer[] {0,1,0,1,0,1};
		Integer[] b=new Integer[] {1,0,1,1,0,0};
		List<Integer> listone=Arrays.asList(a);
		List<Integer> listtwo1=Arrays.asList(b);
		int count=0;
		for (int i=0;i<listone.size();i++)
		{
			
			if (listone.get(i)==listtwo1.get(i))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
