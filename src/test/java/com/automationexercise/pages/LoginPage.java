package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;

import com.automationexercise.base.Basedriver;
import com.automationexercise.locators.LoginPageLocators;

public class LoginPage extends Basedriver{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enter_signup_name(String name) {
		send_keys(LoginPageLocators.SIGNUP_NAME, name);
	}
	
	public void enter_signup_email(String email) {
		send_keys(LoginPageLocators.SIGNUP_EMAIL, email);
	}
	
	public void click_signup_btn() {
		click_element(LoginPageLocators.SIGNUP_BTN);
	}
	
	public void new_user_signup(String name, String email) {
		enter_signup_name(name);
		enter_signup_email(email);
		click_signup_btn();
	}
}
