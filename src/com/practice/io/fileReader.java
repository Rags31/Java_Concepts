package com.practice.io;

import java.io.*;

public class fileReader {

	public static void main(String[] args) throws Exception {
		//To Read the Character or Text Data
		try {
		File file = new File ("Party.txt");
		FileReader fr=new FileReader(file);
		//FileReader fr=new FileReader("Party.txt");
		//System.out.println(fr.read());
	/*	int i=fr.read();//using int
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}*/
		
		char[] c = new char[(int) file.length()];//using char buff
		fr.read(c);
		System.out.println("\nUsing Char Array :");
		for (char ch:c)
		{
			System.out.print(ch);
		}
		fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
