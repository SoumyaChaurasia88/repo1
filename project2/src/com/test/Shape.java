package com.test;
 import java.util.Scanner;
 
 class Figure{
	 int x,y;
	 public Figure(int x,int y){
		 super();
		 this.x=x;
		 this.y=y;
		 
	 }
	 double area(){
		 return  x*y;
		 
	 }
 }
 
 class Rect extends Figure{
	 
	 public Rect(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area();
	}

	
	 
 }
 
 class Tri extends Figure{

	public Tri(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	 
	double area(int x,int y){
		return 0.5*x*y;
		
	}
	
	
 }
 public class shape1{
	 public static void main(String[] args){
		 System.out.println("Enter sahpe");
		 
		 
	 }
	 
 }