package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;

import com.automationexercise.base.Basedriver;
import com.automationexercise.locators.AccountCreatedPageLocators;

public class AccountCreatedPage extends Basedriver {

	public AccountCreatedPage(WebDriver driver) {
		super(driver);
	}

	public boolean is_accountCreated_visible() {
		try {
			wait_until_elementIsVisible(AccountCreatedPageLocators.ACCOUNT_CREATED_MSG);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void click_continue_btn() {
		click_element(AccountCreatedPageLocators.CONTINUE_BTN);
	}

	public String get_username() {
		return get_element_text(AccountCreatedPageLocators.LOGGED_IN_AS);
	}

	public void click_deleteAccount_btn() {
		click_element(AccountCreatedPageLocators.DELETE_ACCOUNT);
	}

}
