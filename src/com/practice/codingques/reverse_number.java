package com.practice.codingques;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append("534");
		System.out.println(sb.reverse());
		
		int number=534;
		StringBuilder sb1=new StringBuilder();
		sb1.append(number);
		System.out.println(sb1.reverse());

		int ld =0,rev = 0;
		while(number>0)
		{
		ld=number%10;
		rev=(rev*10)+ld;
		number=number/10;
		}
		
		System.out.println(rev);
	}

}
