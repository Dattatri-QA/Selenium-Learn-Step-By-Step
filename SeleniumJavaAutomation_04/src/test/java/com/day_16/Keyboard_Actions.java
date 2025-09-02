package com.day_16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard_Actions {

	@Test
	public void  Keyboard_ActionsWindows() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("GouMatha");

		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();




		Thread.sleep(5000);
		driver.quit();
	}
}