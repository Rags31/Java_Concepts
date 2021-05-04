package com.practice.codingques;

import java.io.FileReader;

import org.json.*;

public class Engineer {

	
	public static void main(String[] args) throws Exception {
	    JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("example.json");
	    System.out.println(jsonObject);
	    System.out.println(jsonObject.get("age"));
	}
	    
	public static Object readJsonSimpleDemo(String filename) throws Exception {
	    FileReader reader = new FileReader(filename);
	    JSONParser jsonParser = new JSONParser(filename, null, false);
	    return jsonParser.parse(reader);
	}
		

	

}
