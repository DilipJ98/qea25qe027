package com.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportClass {
	public static  ExtentReports reports;
	public static ExtentTest test;
	
	public static void createReport() {
		reports = new ExtentReports();
		String path = String.valueOf(System.currentTimeMillis());
		ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
		reports.attachReporter(spark);
	}
	
	public static void createTest(String name) {
		test = reports.createTest(name);
	}
	
	public static void closeTheReport() {
		reports.flush();
	}
}
