package com.practice.jsr;

public class datatypes {
	static int num=10;
	static {
		System.out.println("Hi Im in Static Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int num=10;
		datatypes d=new datatypes();
		System.out.println(d.num);
		d.num=20;
		System.out.println(d.num);
		

	}

}
