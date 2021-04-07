package com.practice.io;

import java.io.*;
import java.io.IOException;

public class file_io {
	
	//Files are used to Store that are not meant/doesn't to be stored in Database.
	//To store count , small things that doesn't need persistence.

	public static void main(String[] args) throws Exception {
		//File Name 
		File f=new File("abc.txt");
		//Directory Name
		File f1=new File("tr2");
		//assuming directory is already created , if not create it and use this constructor
		//checking whether the directory exists is a good practice
		File f2=new File(f1,"abc.txt");
		//Absolute Path
		File f3=new File("F://");
		
		if (f.exists())// use to check whether the file exists or not
		{
			System.out.println(f.getName()+" File Exists in "+ f.getAbsolutePath());
		}
		else
		{
			//create a file if not exists
			if(f.createNewFile())
				System.out.println(f.getName()+"File Created in "+f.getAbsolutePath());
		}
		if (f1.exists())
		{
			System.out.println(f1.getName()+" Directory Exists");
		}
		else
		{
			if(f1.mkdir())
			System.out.println(f1.getName()+" Directory Created");
			
		}
		if(f2.exists())
		{
			System.out.println("Directory and File Exists :"+ f2.getAbsolutePath());
		}
		else
		{
			if(f2.createNewFile())
			{
				System.out.println("File Created in :"+f2.getAbsolutePath());
			}
		}
		
		//List the files and directory which is present in F://
		System.out.println(f3.getName()+ " Directory Listings");
		int files=0;
		int dir=0;
		String[] list=f3.list();
		for (String s: list)
		{
			
			File temp=new File(f3,s);
			if(temp.isFile())
				files++;
			if(temp.isDirectory())
				dir++;
			
		}
		System.out.println("Files Count "+files+"\nDir Count "+dir);
	}
	

}
