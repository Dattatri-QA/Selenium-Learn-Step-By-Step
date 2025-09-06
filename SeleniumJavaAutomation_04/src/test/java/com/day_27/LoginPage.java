	package com.day_27;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	public class LoginPage {
	
		WebDriver driver;
	
		LoginPage(WebDriver driver) {
			this.driver=driver;
		}
	
		By txt_username_loc=By.xpath("//input[@placeholder='Username']");
		By txt_password_loc=By.xpath("//input[@placeholder='Password']");
		By txt_button_loc=By.xpath("//button[normalize-space()='Login']");
	
		public void setUserName(String user) {
			driver.findElement(txt_username_loc).sendKeys(user);
		}
		public void setPassword(String pwd) {
			driver.findElement(txt_password_loc).sendKeys(pwd);
		}
		public void clickButton() {
			driver.findElement(txt_button_loc).click();
		}
	}
	
