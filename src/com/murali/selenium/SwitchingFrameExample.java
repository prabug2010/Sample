package com.murali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingFrameExample {
	
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	 
	// Step 1: Navigate to the page with multiple iframes
	driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

	// Step 2: Switch to first frame and then find First Name and Last name
	// element

	/* Switch to the first frame, remember frame index starts from 0 */
	driver.switchTo().frame(0);

	/* now find the First name field */
	WebElement firstName = driver.findElement(By
			.xpath("//*[@id='content']/form/fieldset/div[1]/p[3]/input"));

	/* now find the Last name field */
	WebElement lastName = driver.findElement(By
			.xpath("//*[@id='content']/form/fieldset/div[1]/p[4]/input"));

	// Step 3: Fill some value in the first name and last name files
	firstName.sendKeys("Virender");
	lastName.sendKeys("Singh");

	// Step 4: Switching to the 2nd frame, frame index 1
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);

	//Step 5: Find image element and click on that
	WebElement imageElement = driver.findElement(By
			.xpath("//*[@id='post-9']/div/div[1]/div/p[1]/a/img"));

	imageElement.click();
	System.out.println("Switching successfull");
	}
}
