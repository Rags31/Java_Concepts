package com.practice.jsr;

public class method_overriding {

	//Private methods cannot be overridden but can create method with same name as in parent class. 
	//static method cant be overridden .
	// we can create a method in child class with same method name , method arguments , this is called method hiding.
	static void show(Object o)
	{
		System.out.println("In Object : "+o);
	}
	
	static void show(String o)
	{
		System.out.println("In String : "+o);
		
		
	}

	static void show(int o)
	{
		System.out.println("In Int : "+o);
	}
	
	
	public void  display(int a)
	{
		System.out.println("In Parent Class ");
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show(100.00);

	}

}
