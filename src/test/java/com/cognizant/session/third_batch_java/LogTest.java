package com.cognizant.session.third_batch_java;

import static org.testng.Assert.*;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogTest extends BaseTest {
	@Test(priority = 2)
	public void loginTest() {
		System.out.println("this is login test");
		assertTrue(true);
	}
	
	@Test(priority = 1)
	public void signUp() {
		System.out.println("this is signUp method");
		assertFalse(false);;
	}
	
	@Test(groups = {"Car"})
	public void forgot() {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("hello", "world");
		System.out.println("this is forgot password feature");
		soft.assertEquals("Hello", "HelloWorld");
		soft.assertAll();
	}
	
	@Test(priority = 0)
	public void depand() {
			if (driver.getTitle().equals("Google")) {
				System.out.println("this is depand");
				throw new SkipException("Skipping this Test case as it is Google home page");
			} else { 
				System.out.println("this is depand method");
			}
	}
}
