package com.practice.codingques;
import java.util.*;

public class string_segmentation {
	
	public static boolean segment(Set<String> dict, String s)
	{
		String first,second;
	for (int i=1;i<=s.length();i++)
	{
		first=s.substring(0, i);
		//System.out.println(first);
		if(dict.contains(first))
		{
			System.out.println(first+" is present in the dict");
			second=s.substring(i);
			if (second == null || second.length() == 0 || dict.contains(second) || segment(dict,second)) {
				System.out.println(second+" is present in the dict");
		          return true;
		}
			else
			{
				System.out.println(second+" is not present in the dict");
			}
		}
	
	
	}
	return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

		
		
		Set<String> dict = new HashSet<String>();
		dict.add("apple");
		dict.add("pie");
		dict.add("peer");
		dict.add("apple");
		System.out.println(dict);
		String s="applepeer";
		String first;
		String second;
		boolean b=segment(dict, s);
		if (b)
			System.out.println("String can be Segmented");
		
	}

}
