package com.practice.jsr;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			thread t1=new thread();
			thread t2=new thread();
			t1.start();
			try {
				t1.join();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				t1=null;
				System.out.println("In Finally Block");
				System.gc();
				System.out.println("GC Called");
			}
			t2.start();
			
			}
}
			
	


