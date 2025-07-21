package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;

import com.automationexercise.base.Basedriver;
import com.automationexercise.locators.HomePageLocators;

public class HomePage extends Basedriver {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public boolean is_homepage_visible() {
		try {
			wait_until_elementIsVisible(HomePageLocators.SLIDER_CAROUSEL);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
