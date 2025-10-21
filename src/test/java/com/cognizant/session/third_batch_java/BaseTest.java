package com.cognizant.session.third_batch_java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
	
	WebDriver driver;
	@BeforeClass
	public void setUp() throws IOException {
		driver = new FirefoxDriver();
		driver.get(creds());
		System.out.println("set up method");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("tear down method");
		driver.quit();
	}
	
	public String creds() throws IOException {
		Properties props = new Properties();
		String path = "src/test/resources/config.properties";
		FileInputStream input = new FileInputStream(path);
		props.load(input);
		return  props.getProperty("url");	
	}
	
}
