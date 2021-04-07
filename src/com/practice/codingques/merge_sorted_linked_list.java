package com.practice.codingques;
import java.util.*;

public class merge_sorted_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {4,6,8,10};
		Integer b[]= {3,5,7,9};
		List<Integer> l1=new LinkedList<Integer>(Arrays.asList(a));
		List<Integer> l2=new LinkedList<Integer>(Arrays.asList(b));
		System.out.println(l1);
		System.out.println(l2);
		l1.addAll(l2);
		Collections.sort(l1);
		System.out.println(l1);
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
