package com.practice.jsr;

import java.util.function.BiConsumer;

public class lambdaDemo {

	public static void main(String[] args) {
		// Lambda is one of the Java 8 Features which leads to code consciseness
		// (a,b) ->  System.out.println(a+b) 
		BiConsumer<Integer,Integer> biconsumer = (a,b) ->  System.out.println("Invoked via Lambda :"+ (a+b)) ;
				biconsumer.accept(5, 5);

		//Normal Invocation
				lambdaDemo ld=new lambdaDemo();

				ld.add(5,5);
				
				
	}
	public void add (int a , int b)
	{
		System.out.println(a+b) ;
	}
}
