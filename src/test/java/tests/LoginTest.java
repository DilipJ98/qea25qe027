package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp(ITestContext context) {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
		context.setAttribute("driver", driver);
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
		Assert.assertEquals(false, false);
	}
	
	int i = 1;
	
	@Test(retryAnalyzer = RetryClass.class)
	public void loginTestTwo() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
//		Assert.assertEquals(false, true);
		if (i % 2 == 0) {
			Assert.assertEquals(false, true);
		} else {
			i++;
			Assert.assertEquals(false, true);
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
