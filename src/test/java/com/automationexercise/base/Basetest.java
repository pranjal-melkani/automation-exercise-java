package com.automationexercise.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.automationexercise.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception {
		Readconfig config = new Readconfig();
		String url = config.get_property("url");
		String browser = config.get_property("browser");

		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Unknown browser passed");
		}

		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
