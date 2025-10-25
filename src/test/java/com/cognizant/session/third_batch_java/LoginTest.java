package com.cognizant.session.third_batch_java;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadXLDataAmazon;
import utils.ReadXlData;



public class LoginTest {
	
	@DataProvider(name = "browser", parallel = true)
	public Object[][] browserNames() throws IOException {
		ReadXLDataAmazon xl = new ReadXLDataAmazon();
		return xl.dataReader();
	}
	
	@Test(dataProvider = "browser")
	public void testLogin(String nameOfBrowser, String name, String expected) throws MalformedURLException, InterruptedException {
		System.out.println(nameOfBrowser + " " + name + "" + expected);
		//		ChromeOptions chrome;
//		FirefoxOptions fire;
//		WebDriver driver = null;
//		URL url = new URL("http://10.194.190.138:4444");
//		
//		if (nameOfBrowser.equals("chrome")) {
//			chrome = new ChromeOptions();
//			chrome.addArguments("--incognito");
//			driver =new RemoteWebDriver(url, chrome);
//		} else {
//			fire = new FirefoxOptions();
//			fire.addArguments("-private");
//			driver = new RemoteWebDriver(url, fire);
//		}
//
//		
//		driver.get("https://training-support.net/webelements/login-form");
//		Thread.sleep(7000);
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("password");
//		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
	}
}
