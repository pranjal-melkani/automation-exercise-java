package com.automationexercise.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basedriver {
	WebDriver driver;

	public Basedriver(WebDriver driver) {
		this.driver = driver;
	}

	public void wait_until_elementIsVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void click_element(By locator) {
		wait_until_elementIsVisible(locator);
		WebElement element = driver.findElement(locator);
		element.click();
	}

	public void send_keys(By locator, String input_text) {
		wait_until_elementIsVisible(locator);
		WebElement element = driver.findElement(locator);
		element.clear();
		element.sendKeys(input_text);
	}

	public void select_dropdown(By locator, String visible_text) {
		wait_until_elementIsVisible(locator);
		WebElement element = driver.findElement(locator);
		new Select(element).selectByVisibleText(visible_text);
	}
}
