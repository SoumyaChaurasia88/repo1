package com.test;

public class vehcl {
	String name;
	int price;
	public vehcl(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	void getFeatures(){

		System.out.println("Name "+ name);
		System.out.println("Price "+ price);
	}
	void getMilage(){
		
	}

}
class Car extends vehcl{

	public Car(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMilage() {
		// TODO Auto-generated method stub
		super.getMilage();
	}
	
	
}

class Bike extends vechl{
	public Bike(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void getMilage() {
		// TODO Auto-generated method stub
		super.getMilage();
	}
	
	
}