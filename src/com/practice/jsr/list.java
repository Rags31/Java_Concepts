package com.practice.jsr;

import java.util.*;

/**
 * @author JSR
 *
 */
public class list {

	public static void main(String[] args) {
		
		
		
		
		//String sort
		
		ArrayList l1=new ArrayList(Arrays.asList(7,5,9,3));
		ArrayList l2=new ArrayList(Arrays.asList(8,6,2,10));
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(Collections.max(l1));
	
		
		System.out.println(Collections.binarySearch(l1, Collections.max(l1)));
		
		
		
/*		Integer[] a=new Integer[] {0,1,0,1,0,1};
		Integer[] b=new Integer[] {1,0,1,1,0,0};
		List<Integer> listone=Arrays.asList(a);
		List<Integer> listtwo1=Arrays.asList(b);
		int count=0;
		for (int i=0;i<listone.size();i++)
		{
			
			if (listone.get(i)==listtwo1.get(i))
			{
				count++;
			}
		}
		System.out.println(count);*/
		// TODO Auto-generated method stub
		/*ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of students:");
		int total = sc.nextInt();
		for (int i=1;i<=total;i++)
		{
			list.add(i);
		}
		System.out.println("Roll number of students:"+ list);
		System.out.println("Enter roll number of students:");
		ArrayList<Integer> listtwo = new ArrayList<Integer>();
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			listtwo.add(i);
			}
		ArrayList<Integer> listtwo = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 4, 6));
		//list.removeAll(listtwo);
		System.out.println("Proxy Student"+list.toString());
		System.out.println(list.contains(6));
*/		
	}
}