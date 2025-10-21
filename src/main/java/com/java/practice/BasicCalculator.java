package com.java.practice;

public class BasicCalculator {
	
	int number;
	String name;
	
	
	//constructor 
//	public BasicCalculator(int number, String name) {
//		this.number = number;
//		this.name = name;	
////		System.out.println(number + " " + name);
//	}
	
	
	public  int add(int a, int b) {
		int num = 10;
		System.out.println("this is parent add");
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	
}
