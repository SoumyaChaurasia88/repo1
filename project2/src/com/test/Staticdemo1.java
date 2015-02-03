package com.test;

public class Staticdemo1 {
	static int x,y=20;
	
	static{
		System.out.println("In static block");
		x=10;
	}

	static void getMessage(){
		System.out.println("in static method");
		
	}
	public static void main(String[] args) {
		System.out.println("in main");
		getMessage();
		System.out.println("Value" +(x+y));
	
		
		
	}

}
