package com.automationexercise.locators;

import org.openqa.selenium.By;

public class SignupPageLocators extends NavbarLocators {
	public static final By GENDER_MR = By.id("id_gender1");
	public static final By GENDER_MRS = By.id("id_gender2");
	public static final By PASSWORD = By.id("password");
	public static final By FIRSTNAME = By.id("first_name");
	public static final By LASTNAME = By.id("last_name");
	public static final By ADDRESS = By.id("address1");
	public static final By COUNTRY = By.id("country");
	public static final By STATE = By.id("state");
	public static final By CITY = By.id("city");
	public static final By ZIPCODE = By.id("zipcode");
	public static final By MOB_NO = By.id("mobile_number");
	public static final By CREATE_ACCOUNT_BTN = By.xpath("//button[text()='Create Account']");
}
