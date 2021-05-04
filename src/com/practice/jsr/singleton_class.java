package com.practice.jsr;

public class singleton_class {
	
	private singleton_class()
	{
		
	}
	
	private static singleton_class sc=null;
	
	public static singleton_class getInstance()
	{
		if(sc==null)
		{
			sc=new singleton_class();
		}
		return sc;
	}

}
