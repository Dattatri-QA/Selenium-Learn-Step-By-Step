package com.day_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Action {
	@Test
	public void Action() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");

		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions acs=new Actions(driver);
		Action myaction=	acs.contextClick(button).contextClick().build();
		myaction.perform();


	}
}
