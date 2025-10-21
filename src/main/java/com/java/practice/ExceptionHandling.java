package com.java.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
	public static void main(String[] args)  {
		try {
			throw new CustomException("This is custom exception");
		} catch(CustomException c) {
			System.out.println(c);
		}
	}
}
