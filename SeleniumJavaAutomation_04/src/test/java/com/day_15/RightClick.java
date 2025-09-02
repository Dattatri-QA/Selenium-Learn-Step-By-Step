package com.day_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	@Test
	public void RightClick_Action() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");

		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions acs=new Actions(driver);
		acs.contextClick(button).perform();

		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		driver.switchTo().alert().accept();





		Thread.sleep(5000);
		driver.quit();

	}
}