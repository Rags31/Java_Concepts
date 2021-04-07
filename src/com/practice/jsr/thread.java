package com.practice.jsr;

public class thread extends Thread {
	
	public void run() {
		for (int i =0;i<5;i++)
			System.out.println("Thread "+getName()+": "+i);
	}
	
	public void finalize()
	{
		System.out.println("In Finalize Method");
	}

	}


