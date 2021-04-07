package com.practice.codingques;

public class reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Hello World JSR";
		
		String[] w=s.split("\\s");
		
		for (int i=w.length;i>0;i--)
		System.out.print(w[i-1]+" ");
		
		
		
	}

}
