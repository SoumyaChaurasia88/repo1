package com.test;

public class Inhe3 {
	public static void main(String args[]){
		int arr[]={100,200,300,400,500,600};
		int carr[]=new int[10];
		System.arraycopy(arr, 2, carr, 5, 2);
		for(int a:carr)
			System.out.println(a);
		
		
	}

}
