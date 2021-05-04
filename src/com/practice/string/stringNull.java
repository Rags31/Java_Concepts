package com.practice.string;

public class stringNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String();
		String s1=null;
		String s2="";
		System.out.println((s==null));
		System.out.println((s1==null));
		System.out.println((s2==null));
		
		String s3=new String("Abhi");
		String s4=new String("Abhi");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		
	}
	

}
