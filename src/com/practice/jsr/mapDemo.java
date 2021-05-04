package com.practice.jsr;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class mapDemo {
	
	public static Map marks;
	
	static {
		marks=new HashMap();
		marks.put("Maths", 80);
		marks.put("Physics", 70);
		System.out.println(marks.get("Maths"));
	}
	
	public static void main(String[] args) {
		
		//static hashmap
		//System.out.println(HashMapInitialization.marks.get("Maths"));
		
	
		//Singleton Map -  Only one key value pair is allowed
		 Map singleton=Collections.singletonMap("1", "JSR");
		 System.out.println(singleton);
		 //singleton.put("1","Dhoni"); // unsupported operation exception

		 
		 
		 //HashMap
		 Map hashmap=new HashMap();
		 hashmap.put("7", "Dhoni");
		 hashmap.put("18", "Kohli");
		 hashmap.put("10", "Sachin");
		 hashmap.put("100", "Shaw");
		 
		 
		 
		 //synchronizedMap - if tried to write / update , it will throw concurent modification exception
		 Map sync=Collections.synchronizedMap(hashmap);
		 System.out.println(sync);
		
		 
		 
		 //concurrentHashMap - it will not throw any concurrent modification exception
		 ConcurrentHashMap concurrent=new ConcurrentHashMap();
		 concurrent.put("7", "Dhoni");
		 concurrent.put("18", "Kohli");
		 concurrent.put("10", "Sachin");
		 concurrent.put("100", "Shaw");
		 
		 System.out.println(concurrent.get("7"));
		 
		
		 //LinkedHashMap - Maintains Insertion Order - Not Thread Safe
		 Map linkedmap = new LinkedHashMap();
		 linkedmap.put("7", "Dhoni");
		 linkedmap.put("18", "Kohli");
		 linkedmap.put("10", "Sachin");
		 linkedmap.put("100", "Shaw");
		 
		 System.out.println(linkedmap.get("7"));
	 
	 
	 
	 
	 
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
