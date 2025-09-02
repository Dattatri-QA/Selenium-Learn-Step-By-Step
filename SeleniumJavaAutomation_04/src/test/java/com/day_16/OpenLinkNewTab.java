package com.day_16;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenLinkNewTab {


	@Test
	public void  OpenLinkNewTabs() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.nopcommerce.com/");
		WebElement Reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));

		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(Reglink).keyUp(Keys.CONTROL).perform();

		List<String>ID=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ID.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Gomatha"); 
		driver.switchTo().window(ID.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Phones");









		Thread.sleep(5000);
		driver.quit();
	}

}
