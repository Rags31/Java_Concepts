package com.practice.codingques;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {

		        Scanner in = new Scanner(System.in);
		        int t=in.nextInt();
		        for(int i=0;i<t;i++){
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int n = in.nextInt();
		            
		            
		            for (int j=0;j<n;j++)
		            {
		                int p=0;    
		                int temp=0;
		                temp=j;
		                
		                //System.out.println(Math.pow(2,j)+Math.pow(2,j-1)*b);
		                while (temp>-1)
		                {
		                    p+=Math.pow(2,temp);
		                    temp--;
		                }
		                System.out.print((a+p*b)+" ");
		            }
		            System.out.println();
		            
		            //System.out.println((a+Math.pow(2,0)*b));
		        }
		        in.close();
		    }
		

	

}
