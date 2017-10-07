package com.murali.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
	
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.manage().window().maximize();
		String link = "https://www.gmail.com";
		driver.get(link);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement mail = driver.findElement(By.id("identifierId"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mail.click();
		mail.sendKeys("gprabu2010@gmail.com");
		WebElement next = driver.findElement(By.cssSelector(".ZFr60d.CeoRYc"));
		next.click();
		
	
		WebElement pass = driver.findElement(By.cssSelector(".whsOnd.zHQkBf"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(pass.isDisplayed()&& pass.isEnabled()){
			pass.click();
			pass.sendKeys("@c0509007");
		}
		else 
		{
			System.out.println("Element not interactable");
		}
		WebElement next2 = driver.findElement(By.cssSelector(".RveJvd.snByac"));
		next2.click();
		
		
		
		
		
		
		
	}
	

}
