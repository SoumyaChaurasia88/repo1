package com.test;

 abstract  class Bank {
	void admin(){
		
	}
	abstract void carloan();

	abstract void houseloan();
	abstract void vl();
 }
  class Branch1 extends Bank{
	  
	
	
	@Override
	void carloan() {
		System.out.println("We will give CL");
		
	}

	@Override
	void houseloan() {
		// TODO Auto-generated method stub
		System.out.println("We will give HL");
	}

	@Override
	void vl() {
		// TODO Auto-generated method stub
		System.out.println("We will give VL");
		
	}


}
  class Branch2 extends Bank{

	@Override
	void carloan() {
		// TODO Auto-generated method stub
		System.out.println("We will give CL");
		
	}

	@Override
	void houseloan() {
		// TODO Auto-generated method stub
		System.out.println("We will give HL");
		
	}

	@Override
	void vl() {
		// TODO Auto-generated method stub
		System.out.println("We will give VL");
		
	}
	  
  }
  public class BankAbs{
	  public static void main(String[] args){
		  Bank ref=new Branch1();
		  ref.admin();
		  ref.carloan();
		  ref.houseloan();
		  ref.vl();
		  
		  
	  }
  }
  
