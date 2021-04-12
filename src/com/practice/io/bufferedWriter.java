/**
 * 
 */
package com.practice.io;

import java.io.*;

/**
 * @author JSR
 *
 */
public class bufferedWriter {

	public static void main(String[] args) throws Exception {
		
		// To Overcome the disadvantage of File Writer (newline() method)
		FileWriter fw=new FileWriter("abc.txt");
		
		//bw => fw => abc.txt
		BufferedWriter bw=new BufferedWriter(fw); //communicate with file via Filewriter
		
		//bw1 => bw => fw => abc.txt
		BufferedWriter bw1=new BufferedWriter(bw); //communicate with file via Bufferedwriter - Two level Buffering
		
		//BufferedWriter bw=new BufferedWriter(); //communicate with file via writer and buffersize
		
		bw.write(97);//int
		bw.newLine();
		bw.write('z');//char
		bw.newLine();
		bw.write("RAGHUL");//String
		bw.newLine();
		char[] c= {'m','n','m'};
		bw.write(c);//char array
		bw.flush();
		bw.close();// automatically internal file writer will be closed fw.close();
			
				
		
		
	}

}
