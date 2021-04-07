package com.practice.codingques;

import java.util.*;


public class low_high_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {1,5,5,5,5,6,7,9,5,8,6,2};
		List<Integer> list=new ArrayList();
		int num=5,low,high;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				list.add(i);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Min: "+list.get(0)+"Max: "+list.get(list.size()-1));
		
	}

}
