package com.automationexercise.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	WebDriver driver;

	public Utils(WebDriver driver) {
		this.driver = driver;
	}

	public void take_screenshot(String filename) throws IOException {
		String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots\\" + filename + ".png";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(filepath));
	}
}
