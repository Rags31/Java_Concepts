package com.practice.io;

import java.io.*;

public class fileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To Write the Character or Text Data
		try (FileWriter f= new FileWriter("abc.txt")) {	
			//FileWriter f= new FileWriter("abc.txt",true);//true refers to append to the file
			File file = new File("jsr.txt");
			FileWriter f2= new FileWriter(file);
			System.out.println("Going to Write in : "+file.getAbsolutePath());
			f2.write(100);//int
			f2.write('z');//char
			f2.write("RAGHUL\n");//String
			char[] c= {'m','n','m'};
			f2.write(c);//char array
			f2.flush();
			
			}
		
			catch(Exception e)
			{
					System.out.println(e);
					e.printStackTrace();
			}
		
			//f.close();

	}

}
