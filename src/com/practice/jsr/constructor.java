package com.practice.jsr;

import java.util.Scanner;

public class constructor {

	constructor()
	{
		System.out.println("Test1");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String csv= "Sue,6,true,3";
		Scanner sc=new Scanner(csv);
		sc.useDelimiter(",");
		int age=sc.nextInt();
		System.out.println(age);

	}

}
