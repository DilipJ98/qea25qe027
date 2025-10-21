package com.java.practice;

import java.util.Arrays;

public class ConditionalStatementsEx {
	public static void main(String[] args) {
		int marks = 70;
		
		
		int [] studentMarks =  {150,70,80}; //oneD array
		
		int [][] nums = {
							{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12}
						};
		
		for (int [] i : nums) {
			for (int j : i) {
				System.out.println(j);
			}
		}
				

		
		
		
		
		
		
		
		
		
		
//		if (marks == 60) {
//			System.out.println("The student just passed");
//		} else if (marks >= 80) {
//			System.out.println("distinction");
//		} else if (marks > 60 && marks < 80 ) {
//			System.out.println("First class");
//		}
//		else {
//			System.out.println("the student failed");
//		}
		
//		int number = 10;
//		String str = "hello";
//		switch (str) {
//			case "abc" :
//				System.out.println("this is number" + str);
//				if (marks == 70) {
//					System.out.println("marks are :"+ marks);
//				}
//				break;
//			case "hello":
//				System.out.print("this is second case: " + str);
//				break;
//				
//			default : 
//				System.out.println("default case");
//		}
		
		
	}
}



//if () {}