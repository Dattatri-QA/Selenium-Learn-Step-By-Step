package com.day_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {

	@Test
	public void DoubleClick_Action() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		box1.clear();
		box1.sendKeys("GoMatha");

		Actions act=new Actions(driver);
		act.doubleClick(button).perform();

		String text=box2.getAttribute("value");
		System.out.println("captureed values is : "+text);

		if(text.equals("GoMatha")) {
			System.out.println("Text Copied...");
		}else {
			System.out.println("Text not copyied...");
		}
		Thread.sleep(5000);
		driver.quit();

	}
}