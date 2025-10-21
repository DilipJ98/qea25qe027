package com.java.practice;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your data");
		String userNumber = scanner.nextLine();
		System.out.println(userNumber + " :this is print statement");
	}
}
