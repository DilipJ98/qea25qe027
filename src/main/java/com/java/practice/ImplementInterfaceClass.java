package com.java.practice;

public class ImplementInterfaceClass implements AbsInterface {
	public void sampleMethod() {
		System.out.println("this is implementation to sample method");
	}
	
	public static void main(String[] args) {
		AbsInterface imp = new ImplementInterfaceClass();
		imp.sampleMethod();
		imp.defaultMethod();
	}
}
