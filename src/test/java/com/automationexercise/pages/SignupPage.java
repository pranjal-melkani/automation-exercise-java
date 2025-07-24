package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;

import com.automationexercise.base.Basedriver;
import com.automationexercise.locators.SignupPageLocators;

public class SignupPage extends Basedriver {

	public SignupPage(WebDriver driver) {
		super(driver);
	}

	public void select_gender(String gender) {
		if (gender.equalsIgnoreCase("mr")) {
			click_element(SignupPageLocators.GENDER_MR);
		} else {
			click_element(SignupPageLocators.GENDER_MRS);
		}
	}

	public void enter_password(String password) {
		send_keys(SignupPageLocators.PASSWORD, password);
	}

	public void enter_firstname(String firstname) {
		send_keys(SignupPageLocators.FIRSTNAME, firstname);
	}

	public void enter_lastname(String lastname) {
		send_keys(SignupPageLocators.LASTNAME, lastname);
	}

	public void enter_address(String address) {
		send_keys(SignupPageLocators.ADDRESS, address);
	}

	public void select_country(String country) {
		select_dropdown(SignupPageLocators.COUNTRY, country);
	}

	public void enter_state(String state) {
		send_keys(SignupPageLocators.STATE, state);
	}

	public void enter_city(String city) {
		send_keys(SignupPageLocators.CITY, city);
	}

	public void enter_zipcode(long zipcode) {
		send_keys(SignupPageLocators.ZIPCODE, Long.toString(zipcode));
	}

	public void enter_mob_no(long mob_no) {
		send_keys(SignupPageLocators.MOB_NO, Long.toString(mob_no));
	}

	public void click_createAccount_btn() {
		click_element(SignupPageLocators.CREATE_ACCOUNT_BTN);
	}

	public void enter_details(String gender, String password, String firstname, String lastname, String address,
			String state, String city, long zipcode, long mob_no) {
		select_gender(gender);
		enter_password(password);
		enter_firstname(firstname);
		enter_lastname(lastname);
		enter_address(address);
		enter_state(state);
		enter_city(city);
		enter_zipcode(zipcode);
		enter_mob_no(mob_no);
		click_createAccount_btn();
	}
}
