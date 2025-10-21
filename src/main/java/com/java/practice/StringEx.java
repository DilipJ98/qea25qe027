package com.java.practice;

public class StringEx {
	public static void main(String[] args) {
		String name = "Dileep";
//		System.out.println(name.length());
		
		StringBuilder strBuilder = new StringBuilder("Dileep");
		
		strBuilder.append("Jaligama");
		strBuilder.delete(6, strBuilder.length());
		System.out.println(strBuilder);
	}
}


//stringBuilder and StringBuffer
//Inheritance -> supports code re usability  
//Abstraction -> which is something only shows necessary data not implementation
//Encapsulation -> protecting your data
//Polymorphism -> one thing showing multiple behaviour 
