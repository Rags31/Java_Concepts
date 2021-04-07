package com.practice.codingques;

import java.util.*;

/**
 * @author JSR
 *
 */
public class missing_element_array {

	public static void main(String[] args) {
		
		//Missing elements in Array
		Integer a[]= {1,2,4,5,8,6};
		List<Integer> list=new ArrayList(Arrays.asList(a));
		System.out.println("Given Array :"+list);
		List<Integer> temp=new ArrayList();
		Collections.sort(list);
		int min=list.get(0);
		/*int total=list.size();
		System.out.println(total);
		*/int max=list.get(list.size()-1);
		System.out.println("Min:" + min + "Max:"+ max);
		System.out.println("Given Array in sorted : "+list);
		
		for (int i=min;i<=max;i++)
		{
			temp.add(i);
		}
		System.out.println("temp :"+temp);
		temp.removeAll(list);
		System.out.println("Missing Numbers :"+ temp.toString());
	}
}