package com.practice.string;



public class stringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If String object is mutable , then we cant use it as key in hash map 
		
		String s1="Hello";
		String s2="Hello";
		String s3="Hello";
		String s4="Hello";
		String s5="Hello";
		s5.concat(" World");
		//s5.intern();
		
		String s6=new String("Hello World");
		String s7="Hello World";
		
		if (s5==s7)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		System.out.println("s5 : "+s5);
		System.out.println("s6 : "+s6);
		System.out.println("s7 : "+s7);

	}

}
