package com.practice.codingques;

import java.util.*;

/**
 * @author JSR
 *
 */
public class missing_element_array {

	public static void main(String[] args) {
		
		
		//if the missing number is only one element , we can use the below method
		
		int arr[]= {1,2,3,5};
		int length=arr.length+1;
		int esum=length * ((length + 1)/2);
		int rsum=0;
		for(int b:arr)
		{
			rsum+=b;
		}
		System.out.println("Expected Sum : "+esum+"\nReality Sum : "+rsum+"\nMissing Element : "+(esum-rsum));
		
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