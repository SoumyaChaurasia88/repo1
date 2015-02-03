package com.test;
class S {

	public S() {
		
		System.out.println("Constructor");
	}
	
	static{
		System.out.println("Static");
	}
}

public class Initdemo  extends S{
	static{
		System.out.println("Static1");	
	}
static{
	System.out.println("Static2");	
}
	
int x;
int y;

public Initdemo(int x, int y) {
	
	this.x = x;
	this.y = y;
	System.out.println(x + " "+ y);
	
}
{
	System.out.println("init block1");
}

{
	System.out.println("init block2");
}
public static void main(String[] args) {
		Initdemo i1=new Initdemo(10,20);
		Initdemo i2=new Initdemo(1,2);

	}

}
