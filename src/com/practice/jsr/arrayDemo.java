package com.practice.jsr;

import java.util.*;

public class arrayDemo {

	public static void main(String[] args) {
		
		//Printing an array
		int[] a= {8,12,2,3,5,1};
		
		int[] b= { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int[] c= {0,1,2,0,1,2};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		/* //Occurence or Frequency of a String
		 int input=2,flag=0;
		System.out.println("Array Set A "+"\nLength: "+a.length);
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i] == input  )
			{
				flag++;
			}
		}
		System.out.println("count of "+input+" : "+flag);
		*/
		
		//Printing an array
		//System.out.println(a);// prints address
		//Arrays.sort(a);// Sorts array in ascending order
		//System.out.println(a[a.length-2]);//Prints second maximum number in a array
		/*System.out.println("Array Set A :\n"+"Length: "+a.length);
		for (int i:a)
		{
			System.out.println(i);
		}
		boolean f=Arrays.equals(a, c);
		System.out.println(f);*/
		
		/*//Finding Duplicate elements in an array
		for (int i=0;i<a.length;i++)
		{
			int com=a[i];
			for (int j=i+1;j<a.length;j++)
				{
					if (a[i]==a[j])
						{
							System.out.println(a[i]);
						}
				}
		}*/
	}

}
