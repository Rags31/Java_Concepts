package com.practice.string;
import java.util.*;
import java.util.regex.Pattern;



public class stringPractice {

	

	public static void main(String[] args) {

		
		/*//char count
		int count=0;
		String s="RAGHUL JS";
		
		System.out.println(s.length());
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			count++;
			
		}
		System.out.println(count);
		char[] c=s.toCharArray();
		System.out.println(c);
		System.out.println(c.length);
		*/
		
		//valueOf vs toString Comparison
		
		/*String s= null;
		System.out.println(String.valueOf(s));// returns string value of null
		System.out.println(s.toString()); //returns null pointer exception
		*/
		
		// String Password check using Regex
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input String");
		String s=sc.nextLine();
		//System.out.println(Pattern.matches("^[a-zA-Z][a-zA-Z0-9$#%&@]{8,15}", s));
		System.out.println(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", s));
		
		*/
		/*
		//String Builder Example
		
	 StringBuilder sb = new StringBuilder(40);
		sb.append("Kamalhassan");
		//System.out.println(sb.toString());
		String s = sb.toString();
		System.out.println("String : "+s+" StringBuilder : "+sb);
		//System.out.println(sb.reverse());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character to Search in the String :");
		char input=sc.next().charAt(0);
		int flag=0;
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i) == input )
			{
				flag++;
			}
		}
		System.out.println("count of a : "+flag);
		*/
		
		
		/*// String Comparison using = and equals 
		 
		String s1= "Raghul JS";
		s1+=("R");
		String s2= "Raghul JSR";
		String s3=s1.intern();
		s3+="R";
		String s4=s2.intern();
		s4+="R";
		System.out.println("s1:"+s1+" s2:"+s2+" s3:"+s3+" s4:"+s4);
		if (s3.equals(s4))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}*/
		
		
		
		//String Word Reversal
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word");
		
		String ip=sc.nextLine();
		//String words[]=ip.split("\\s+");
		System.out.println("Length"+ip.length());
		//System.out.println("Length"+words.length);
		//System.out.println("Words"+Arrays.toString(words));
		
		int length=ip.length();
		for(int i=1;i<=length;i++)
		{
			String[] temp=new String[i+1];
			temp[i-1] = "";
			temp[i]= ip.substring(ip.length()-i);
			System.out.println(ip.substring(ip.length()-i));
		}
		

}

}
