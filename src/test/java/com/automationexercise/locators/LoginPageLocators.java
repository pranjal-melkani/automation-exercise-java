package com.automationexercise.locators;

import org.openqa.selenium.By;

public class LoginPageLocators extends NavbarLocators {
//	New User Signup
	public static final By SIGNUP_NAME = By.xpath("//form[@action='/signup']//input[@name='name']");
	public static final By SIGNUP_EMAIL = By.xpath("//form[@action='/signup']//input[@name='email']");
	public static final By SIGNUP_BTN = By.xpath("//form[@action='/signup']//button");
	
//	Login to your account
	public static final By LOGIN_EMAIL = By.xpath("//form[@action='/login']//input[@name='email']");
	public static final By LOGIN_PASSWORD = By.xpath("//form[@action='/login']//input[@name='password']");
	public static final By LOGIN_BTN = By.xpath("//form[@action='/login']//button");
}
