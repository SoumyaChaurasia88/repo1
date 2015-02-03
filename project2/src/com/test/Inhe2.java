package com.test;

public class Inhe2 {
	String cn;
	String name;
	int salary;
	
	public Inhe2(){
		System.out.println("In one para const");
		getDetails();
	
		}
	public Inhe2(String name,int salary,String cn){
		this(name,salary);
		System.out.println("In 3 para const");
		getDetails();
		this.cn=cn;
		
	}
	
	public Inhe2(String name,int salary){
		this(name);
		System.out.println("in 2 para const");
		getDetails();
		this.salary=salary;
	}

	public Inhe2(String name){
		this.name=name;
	}
	
	void getDetails(){
		System.out.println("Emp name "+name);
		System.out.println("Emp Salary"+salary);
		System.out.println("Company name"+ cn);
	}
	public static void main(String[] args) {
		Inhe2 s=new Inhe2("Ram",7000,"sap");
		s.getDetails();
		
	}

}
