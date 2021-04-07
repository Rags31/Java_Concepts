package com.practice.codingques;

import java.util.Arrays;

public class largest_element_repeated_ktimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,3,6,2,7,8,2,7,10};
		Arrays.sort(a);//2,2,3,5,6,7,7,8,10
		for (int i=a.length-1;i>0;i--)
		{
			int count=1;
			if(a[i]==a[i-1])
			{
				count++;
			}
			if(count==2)
			{
				System.out.println(a[i]);
				break;
			}
		}
		

	}

}
