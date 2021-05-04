package com.practice.jsr;

import java.io.*;
import java.sql.SQLException;
import java.util.Objects;

public class exception_handling {
	
	public static void main(String[] args) throws IOException,RuntimeException  {
		// TODO Auto-generated method stub
	
			
		try {
			
			//throw new RuntimeException();
			//after the exception is found remaining lines wont be executed
			//System.out.println("After Exception in try block");
			//cannot throw multiple exception
			//throw new IOException();
			throw new NullPointerException();
		}
		
		//there should be no lines after try statement , immediately it should be either try or catch
		//either catch or finally should be present after try , otherwise error will occur
		
		//Multi Catch block (OR Operator), introduced in Java 7
		catch (NullPointerException | ArithmeticException e)
		{
			System.out.println("In Multi Catch Block");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Caught");
			//System.exit(1);
		}

		//wont execute in two times
		//system.exit();
		//system crash
		finally
		{
			System.out.println("In Finally Block");
		}
		

	}
	


	
}
