package com.murali.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class HomePageWordpress {
	
	public static WebElement element = null;
	
	public static WebElement login(WebDriver driver)
	{
		element = driver.findElement(By.id("user_login"));
		return element;
	}
	
	public static WebElement pass(WebDriver driver)
	{
		element = driver.findElement(By.id("user_pass"));
		return element;
	}
	
	public static WebElement submit(WebDriver driver)
	{
		element = driver.findElement(By.id("wp-submit"));
		return element;
	}
}