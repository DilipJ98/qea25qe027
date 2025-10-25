package com.listener;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.reports.ReportClass;

public class ListnerClass implements ITestListener {
	WebDriver driver;
	
	@Override
	public void onStart(ITestContext context) {
		ReportClass.createReport();
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		ReportClass.createTest(result.getMethod().getMethodName());
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		ReportClass.test.log(Status.PASS, "this test passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		ReportClass.test.log(Status.FAIL, "this test failed");
		driver = (WebDriver) result.getTestContext().getAttribute("drivername");
		String img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		ReportClass.test.addScreenCaptureFromBase64String(img);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		ReportClass.test.log(Status.SKIP, "this test skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		ReportClass.closeTheReport();
	}
}
