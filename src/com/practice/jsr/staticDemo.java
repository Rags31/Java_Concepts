package com.practice.jsr;

class Test
{
	static {
		System.out.println("In Static Block Test Class");
	}
	public static final int x=5;
	
	public static void main(String a[])
	{
		System.out.println(Test.x);
	}
}

public class staticDemo {


	
	static {
		System.out.println("In Static Block");
	}
	
	public static final int x=5;
	
	public static void main(String[] args) {
		
		System.out.println(staticDemo.x);
		System.out.println(new Test().x);
		

	}

}
