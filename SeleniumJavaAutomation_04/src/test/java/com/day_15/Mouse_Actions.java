package com.day_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Actions {

	@Test
	public void Mouse_Action() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://tutorialsninja.com/demo/");
		WebElement desktops=	driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(desktops).moveToElement(mac).click().build().perform();
		
		
		Thread.sleep(4000);
		driver.quit();
	}
}