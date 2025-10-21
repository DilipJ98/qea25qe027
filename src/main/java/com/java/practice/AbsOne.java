package com.java.practice;

public abstract class AbsOne {
	
	int num;
	String name;
	
	public AbsOne() {
		// TODO Auto-generated constructor stub
		System.out.println("this is my cons");
	}
	
	abstract void payment();
	
	void concreteMethod() {
		System.out.println("This is concrete method");
	}

}
