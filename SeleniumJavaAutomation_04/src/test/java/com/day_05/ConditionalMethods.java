package com.day_05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConditionalMethods {

	@Test
	public void ConditionMethods() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://demo.nopcommerce.com/register");

		// WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo
		// store']"));
		// System.out.println(logo.isDisplayed());

		// boolean dis = driver.findElement(By.xpath("//img[@alt='nopCommerce demo
		// store']")).isDisplayed();
		// System.out.println(dis);

		boolean status = driver.findElement(By.xpath("//input[@id='Email']")).isEnabled();
		System.out.println(status);

		WebElement selected_male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		selected_male.click();
		System.out.println(selected_male.isSelected());

		WebElement selected_female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		selected_female.click();
		System.out.println(selected_female.isSelected());

		

	}
}
