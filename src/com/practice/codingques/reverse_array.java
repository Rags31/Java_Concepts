package com.practice.codingques;

import java.util.*;
import java.util.stream.Collectors;

public class reverse_array {
public static void main(String args[])

			{
	
	Integer a[]= {1,2,3,4};
	List<Integer> list=new ArrayList(Arrays.asList(a));
	Collections.reverse(list);
	System.out.println(list);
	
	int  b[]= {1,2,3,4};
	List<Integer> list2= Arrays.stream(b).boxed().collect(Collectors.toList());
	Collections.reverse(list2);
	System.out.println(list2);
	
	Integer c[]= Arrays.stream(b).boxed().toArray(Integer[]::new);
	
	int a1 = 7/2;
	System.out.println(a1);
	Arrays.sort(b);
	Collections.sort(list);
	

	
	
	
		}	
}
