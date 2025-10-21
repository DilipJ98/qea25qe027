package keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public void openBrowser() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
	
	public void navigate(String url) {
		driver.get(url);
	}
	
	public void enterText(String locatorName, String locatorValue, String data) {
		if (locatorName.equals("id")) {
			driver.findElement(By.id(locatorValue)).sendKeys(data);;
		} else if (locatorName.equals("xpath")) {
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);;
		}
	}
	
	public void clickBtn(String locatorName, String locatorValue) {
		driver.findElement(By.id(locatorValue)).click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getText(String locatorName, String locatorValue) {
		return driver.findElement(By.xpath(locatorValue)).getText();
	}
	
	public String verify(String locatorName, String locatorValue) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue))).getText();
	}
}
