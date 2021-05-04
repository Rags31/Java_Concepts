package com.practice.codingques;


import java.util.*;
import java.util.stream.Collectors;

public class max_min_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,7,1,2,8,4,3};
		Arrays.sort(a);
		
		Integer b[]=Arrays.stream(a).boxed().toArray(Integer[]::new);
		List<Integer> list=Arrays.stream(a).boxed().collect(Collectors.toList());
		
		for(Integer i:a)
		{
			System.out.println(i);
		}
		System.out.println("Max Element:"+a[a.length-1]);
		System.out.println("Max Element:"+a[0]);

	}

}
