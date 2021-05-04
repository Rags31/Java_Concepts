package com.practice.codingques;

import java.util.*;

public class arrange_array_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {9, 8, 13, 2, 19, 14};
		List odd= new ArrayList();
		List even= new ArrayList();
		
		for (int i=0;i<array.length;i++)
		{
			if (array[i]%2==0)
			{
				even.add(array[i]);
			}
			else
			{
				odd.add(array[i]);
			}
		}
		
		Collections.sort(odd);
		Collections.sort(even);
		System.out.println(even);
		System.out.println(odd);
		
		Arrays.sort(array);
		boolean flag=false;
		if (array[0]%2==0)
		{
			flag=true;
		}
		int j=0,k=0,index=0;
		while(index < array.length)
		{
			if(flag)
			{
				array[index]=(int) even.get(j);
				j++;
				index++;
				flag = !flag;
			}
			else
			{
				array[index]=(int) odd.get(k);
				k++;
				index++;
				flag = !flag;
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		

	}

}
