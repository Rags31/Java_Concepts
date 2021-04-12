package com.practice.io;

import java.io.*;
/**
 * @author JSR
 *
 */

public class bufferedReader {

	public static void main(String[] args) throws Exception {
		//To overcome File Reader disadvantage BufferedReader was Introduced
		//We can read data line by line also char by char
		
		//Buffered Reader cannot communicate directly with file
		FileReader fr=new FileReader("Party.txt");
		BufferedReader br= new BufferedReader(fr);// communicate with file via file reader
		//BufferedReader br1= new BufferedReader(br);// communicate with file via buffered reader
		
		String s=null;
		
		while ((s=br.readLine()) != null)
		{
			System.out.println(s);
		}
		br.close();// closing buffered reader will close the file reader implicitly(fr.close)
		
		
	}

}
