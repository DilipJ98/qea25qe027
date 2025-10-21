package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocalSoftware {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp(ITestContext context) {
		driver = new FirefoxDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		context.setAttribute("driver", driver);
	}
	
	@Test
	public void testOne() {
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void testTwo() {
		Assert.assertTrue(false);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
