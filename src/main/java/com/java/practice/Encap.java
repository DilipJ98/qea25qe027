package com.java.practice;

public class Encap {
	 private int number;
	 
	 
	//setter method
	 public void setNumber(int num) {
		 if (num > 99) {
			 number = num;
		 }
	 }
	 
	 //getter method
	public int getNumber() {
		return number;
	}
}
