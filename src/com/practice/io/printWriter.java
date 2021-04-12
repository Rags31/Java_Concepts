package com.practice.io;

import java.io.*;
public class printWriter {

	public static void main(String[] args) throws Exception {
		//Most enhanced file writer
		//bw.write(100) - d , bw.write("100") - 100 , using double quotes in the arguments 
		//which is string reduce the overall performance
		//we can use println method to insert newline as well
		//it can communicate directly with object also
		
		//PrintWriter pw1= new PrintWriter(File f);
		//PrintWriter pw1= new PrintWriter(FileWriter fw);
		FileWriter fw=new FileWriter("abc.txt",false);//true parameter means appending to file
		PrintWriter pw= new PrintWriter(fw);
		pw.println("Dhoni");
		pw.println("Kohli");
		pw.println("Rohit");
		pw.println('M');
		pw.println(100);
		pw.flush();
		pw.close();
	}

}
