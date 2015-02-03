package com.test;
import  static com.test.Test.getMessage;

class Test{
	static int x,y=20;
	
	
	static{
		System.out.println("in static block");
		x=10;
		
	}
	static void getMessage(){
		System.out.println("in static metod");
	}
}




public class Static2demo {
public static void main(String args[]){
	System.out.println("in main");
	getMessage();}
}