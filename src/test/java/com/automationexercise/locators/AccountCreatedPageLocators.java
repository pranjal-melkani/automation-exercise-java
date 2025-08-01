package com.automationexercise.locators;

import org.openqa.selenium.By;

public class AccountCreatedPageLocators extends NavbarLocators {
	public static final By ACCOUNT_CREATED_MSG = By.xpath("//h2[@data-qa='account-created']");
	public static final By CONTINUE_BTN = By.linkText("Continue");
}
