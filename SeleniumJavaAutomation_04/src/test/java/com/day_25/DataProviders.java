package com.day_25;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	WebDriver driver;

	@BeforeMethod
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}
	@Test(dataProvider = "dp")
	void testLogin(String email,String pwd) throws Throwable {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);

		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		System.out.println(status);

		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			assertTrue(true);
		}else {
			fail();
		}

	}
	@AfterClass
	void tearDown() {
		driver.close();

	}

	@DataProvider(name="dp",indices = {0,3,4})
	Object[][] loginData() {

		Object data[][]= {
				{"testing000@gmail.com","123456"},
				{"teg000@gmail.com","1256"},
				{"tes0@gmail.com","1234"},
				{"pavano123@gmail.com","test@123"},
				{"testin00@gmail.com","12346"},
		};
		return data;
	}
}
