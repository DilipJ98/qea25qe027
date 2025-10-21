package com.java.practice;

public class MethodOverLoading {
	public static void main(String[] args) {
		System.out.println("This is main method");
		main(false);
		main(100);
	}
	public static void main(int args) {
		System.out.println(args);
	}
	
	public static void main(boolean args) {
		System.out.println(args);
	}

}
