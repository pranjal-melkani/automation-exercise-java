package com.automationexercise.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationexercise.base.Basetest;
import com.automationexercise.pages.HomePage;
import com.automationexercise.utilities.Utils;

public class Test_Signup_Login extends Basetest {
	
	@Test
	public void register_user() throws IOException {
		Utils ut = new Utils(driver);
		
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.is_homepage_visible(), "Homepage is not visible");
		ut.take_screenshot("homepage_visible");
		hp.click_signupLogin_btn();
		
		
	}
}
