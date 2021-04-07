package com.practice.codingques;

import java.util.Arrays;

public class max_min_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {5,7,1,2,8,4,3};
		Arrays.sort(a);
		
		for(Integer i:a)
		{
			System.out.println(i);
		}
		System.out.println("Max Element:"+a[a.length-1]);
		System.out.println("Max Element:"+a[0]);

	}

}
