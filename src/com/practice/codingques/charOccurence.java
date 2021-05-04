package com.practice.codingques;

public class charOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String s= "I Love Java Coding";
		char val='i';
		getbyCharArr(s,val);
		getbyCharAt(s,val);
		

		
	}
	
	public static void getbyCharAt(String s,char val) {
		
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i) == val)
			{
				count++;
			}
		}
		System.out.println("Val : "+count);
		
		}

	
	public static void getbyCharArr(String s,char val) {
		
	
	int count = 0;
	
	s=s.toLowerCase();
	for (char c: s.toCharArray())
	{
		if (c == val)
			count++;
	}
	System.out.println("Val : "+count);

	}
	
}
