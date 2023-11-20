package com.app.TestNG.ExtendedReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo{
	
	@Test
	public void extendDemo2() throws IOException {
		
		ExtentReports ex = new ExtentReports();
		File file = new File("report2.html");

		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		 
		ExtentTest test1 = ex.createTest("Test1");
		test1.pass("Test case passed");
		
		ExtentTest test2 = ex.createTest("Test2");
		test2.pass("Test case passed");

		ExtentTest test3 = ex.createTest("Test1");
		test3.log(Status.FAIL,"This test is failed");
		

		ExtentTest test4 = ex.createTest("Test1");
		test4.skip("This test has skipped");
		
		ex.flush();
		Desktop.getDesktop().browse(new File("report2.html").toURI());
		
		

	}
}
