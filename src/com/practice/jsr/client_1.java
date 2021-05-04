package com.practice.jsr;

public class client_1 extends method_overriding {
	static void show(int o)
	{
		System.out.println("In int of client class : "+o);
	}
	
	public void display(double d)
	{
		System.out.println("In Child Class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		client_1 c= new client_1();
		c.show(100);
		c.display(10.0);
	}

}
