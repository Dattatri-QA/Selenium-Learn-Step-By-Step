package com.day_27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	LoginPage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//input[@placeholder='Username']")
	WebElement username;

	@FindBy(xpath ="//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath ="//button[normalize-space()='Login']")
	WebElement loginButton;


	public void setUserName(String user) {
		username.sendKeys(user);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickButton() {
		loginButton.click();
	}
}

