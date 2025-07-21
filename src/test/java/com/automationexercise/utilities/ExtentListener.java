package com.automationexercise.utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListener implements ITestListener {
	ExtentSparkReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;

	public void configure_report() throws IOException {
		Readconfig config = new Readconfig();

		String timestamp = new SimpleDateFormat("dd.MM.yy hh.mm.ss").format(new Date());
		String report_path = System.getProperty("user.dir") + "\\reports\\Report " + timestamp + ".html";

		htmlReporter = new ExtentSparkReporter(report_path);
		report = new ExtentReports();
		report.attachReporter(htmlReporter);

		report.setSystemInfo("User", config.get_property("user"));
		report.setSystemInfo("OS", config.get_property("os"));
		report.setSystemInfo("System Type", config.get_property("system_type"));

		htmlReporter.config().setDocumentTitle("Log Report");
		htmlReporter.config().setReportName("Website Testing");
		htmlReporter.config().setTheme(Theme.DARK);
	}

	@Override
	public void onStart(ITestContext context) {
		try {
			configure_report();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = report.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Test Passed", ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test = report.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Test Failed", ExtentColor.RED));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test = report.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Test Skipped", ExtentColor.YELLOW));
	}
}
