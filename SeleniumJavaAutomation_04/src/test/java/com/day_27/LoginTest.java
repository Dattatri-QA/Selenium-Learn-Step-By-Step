package com.day_27;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod
	void setup() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

	}
	@Test
	void testLogin() throws Throwable {
		LoginPage page=new LoginPage(driver);
		page.setUserName("Admin");
		page.setPassword("admin123");
		page.clickButton();
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "OrangeHRM");

	}
	@AfterClass
	void tearDown() throws Throwable {
		Thread.sleep(3000);
		driver.quit();

	}

}
