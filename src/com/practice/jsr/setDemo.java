package com.practice.jsr;


import java.util.*;

public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a=new Integer[] {0,1,2,3,4,4};
		Set s=new HashSet();
		s.add(null);
		s.add(5);
		for(Object i:s)
		{
		System.out.println(i);
		}
		
		

	}

}
