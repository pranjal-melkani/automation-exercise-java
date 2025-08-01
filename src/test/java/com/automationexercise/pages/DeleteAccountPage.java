package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;

import com.automationexercise.base.Basedriver;
import com.automationexercise.locators.DeleteAccountPageLocators;

public class DeleteAccountPage extends Basedriver {

	public DeleteAccountPage(WebDriver driver) {
		super(driver);
	}

	public boolean is_accountDeleted_visible() {
		try {
			wait_until_elementIsVisible(DeleteAccountPageLocators.ACCOUNT_DELETED_MSG);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
