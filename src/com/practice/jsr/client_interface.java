package com.practice.jsr;

public class client_interface implements interface_demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		client_interface c=new client_interface();
		c.show();

	}

	@Override
	public void show() {
		System.out.println("Hi");
		
	}
	


}
