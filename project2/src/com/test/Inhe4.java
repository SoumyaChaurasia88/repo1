package com.test;

public class Inhe4 {
String name;
int age;
Inhe4(){
	System.out.println("Name" + name +"age" + age);
	name="Ram";
	age=24;
	System.out.println("In super class cons");
	System.out.println("After Name"+ name +"age"+ age);
}
void m1(){
	System.out.println("In super m1");
	System.out.println("Name"+name);
	System.out.println("Age :"+age);
	
}
}
class Man extends Inhe4{
	Man(){
		System.out.println("Name"+ name+ "age" + age);
		name="Asha";
		age=24;
		System.out.println("In sub class cons");
		System.out.println("After Name"+ name + "Age" +age);
		
	}

}


class inhercons{
		public static void main(String[] args) {
			Inhe4 e=new Inhe4();
			Man ob=new Man();
			e.m1();
			ob.m1();
		}
		

	}


