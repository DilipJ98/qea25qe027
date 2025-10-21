package com.java.practice;

 public class GetEncapData {
	public static void main(String[] args) {
		Encap cap = new Encap();
		cap.setNumber(100);
		int number = cap.getNumber();
//		System.out.println(number);
		System.out.println("this is main method");
	}
	
	static {
		System.out.println("Hello static");
	}
}
