package com.day_26;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListener implements ITestListener {

	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/0reports/Report.html");

		sparkReporter.config().setDocumentTitle("Automation Report"); 
		sparkReporter.config().setReportName("Functional Testing"); 
		sparkReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Dattatri");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Browser name", "Chrome");
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case PASSED is: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case FAILED is: " + result.getName());
		test.log(Status.FAIL, "Reason: " + result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test case SKIPPED is: " + result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
