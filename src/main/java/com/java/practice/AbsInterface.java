package com.java.practice;

public interface AbsInterface {
	
	int number = 20;
	
	void sampleMethod();
	
	default void defaultMethod() {
		System.out.println("default method");
	}
}
