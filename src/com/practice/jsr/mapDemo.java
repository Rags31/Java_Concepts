package com.practice.jsr;


import java.util.*;

public class mapDemo {
	
	public static void main(String[] args) {
	
		
		/*Map<String,String> m=new LinkedHashMap();
		m.put("Name","Raghul" );
		m.put("Address","Maduravoyal" );
		m.put("Phone","Raghul" );
		*/
		
		HashMap m=new LinkedHashMap();
		m.put("b",40);
		m.put("a",2 );
		m.put("z",10 );
		m.putIfAbsent("d", 4);
		System.out.println("Map Before Sorting :");
		m.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
		//use treemap for sorted keys
	 TreeMap tm=new TreeMap(m);
	 System.out.println(tm.toString());
		
		/*//using Map.Entry for Traversing
		for (Map.Entry<String,String> entry : m.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
		*/
		/*//using keySet() and Values() for Traversing
				for (String key : m.keySet())  
		            System.out.println(key ); 
		                              
				for (String value : m.values())
				{
					
		            System.out.println(value );
				}
		//foreach(action)
				m.forEach((k,v) -> System.out.println("Key = "
		                + k + ", Value = " + v)); 
		*/        
	}

}
