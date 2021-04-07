package com.practice.codingques;
import java.util.*;

public class first_non_repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabc";
		
		
		Map<Character,Integer> map=new HashMap();
		for (int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(map.containsKey(c))
			{
				map.put(s.charAt(i),map.get(c) + 1);
			}
			else {
				map.put(s.charAt(i),1);
			}
		}
		for (int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(map.get(c)==1)
			{
				System.out.println(c);
				break;
			}
		
		
		/*for (int i=0;i<w.length();i++)
		{
			boolean s=false;
			for (int j=0;j<w.length();j++)
			{
				
				if (w.charAt(i)==w.charAt(j) && (i!=j))
				{
					s=true;
					break;
				}
					if (!s)
					{
						System.out.println(w.charAt(i));
					}
			}
		
		}*/

	}

	}
}
