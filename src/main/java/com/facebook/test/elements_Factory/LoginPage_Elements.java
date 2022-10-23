package com.facebook.test.elements_Factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.facebook.test.Helpers.BaseTest;

/**
 * Hello world!
 *
 */
public class LoginPage_Elements extends BaseTest {

	// WebElement for Email/Phone text box
	@FindBy(id = "email")
	public WebElement txt_userName;

	// WebElement for password text box
	@FindBy(id = "pass")
	public WebElement txt_password;

	// WebElement for Log In Button
	@FindBy(xpath = "//input[@value='Log In']")
	public WebElement btn_logIn;

}
