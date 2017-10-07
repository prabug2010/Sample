package com.murali.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {
	
	public void alertAutomation() throws InterruptedException{
		
		//Create firefox driver's instance
		WebDriver driver = new FirefoxDriver();
							
		//Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
		//Launch sampleSiteForSelenium
		driver.get("http://www.artoftesting.com/sampleSiteForSelenium.html");
							
		//Handling alert boxes
		//Click on generate alert button
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	driver.findElement(By.cssSelector("div#AlertBox>button")).click();
		WebElement abox = driver.findElement(By.cssSelector("div#AlertBox button"));
		if(abox.isEnabled())
		{
			System.out.println("box loaded");
		}
		System.out.println(abox.getText());
		abox.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
			
		//Using Alert class to first switch to or focus to the alert box
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
			
		//Using accept() method to accept the alert box
		alert.accept();
			
		//Handling confirm box
		//Click on Generate Confirm Box
	//	driver.findElement(By.cssSelector("div#ConfirmBox button")).click();
			
	//	Thread.sleep(3000);
			
	//	Alert confirmBox = driver.switchTo().alert();
			
		//Using dismiss() command to dismiss the confirm box
		//Similarly accept can be used to accept the confirm box
	//	confirmBox.dismiss();
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		Popup obj = new Popup();
		obj.alertAutomation();
	}
}
