package com.test;

public class Inhe1 {

	public static void main(String[] args) {
		Inhe1 s=new Inhe1(10);
		
	}
	Inhe1(){
		System.out.println("hello");
		
	}

	Inhe1(int x){
		this("Ramana");
		System.out.println("value"+x);
		
	}
Inhe1(String a){
	this();
	System.out.println("name "+a);
	
}

}
