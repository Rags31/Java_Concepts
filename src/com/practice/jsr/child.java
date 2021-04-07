package com.practice.jsr;

public class child extends parent {
	
	void show()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent p = new child();
		p.show();

	}

}
