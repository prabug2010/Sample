package com.murali.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDropCodeOwn {
	
	@FindBy(css = "#sourceImage")
	public WebElement src;
	
	@FindBy(css = "#targetDiv")
	public WebElement dest;
	
	
	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds) {
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}
	
	public void dragndrop()
	{
		WebDriver driver = new FirefoxDriver();
		String url = "http://artoftesting.com/sampleSiteForSelenium.html";
		driver.get(url);
		PageFactory.initElements(driver, this);
		String title = driver.getTitle();
		System.out.println(title);
		
		waitFor(driver, ExpectedConditions.elementToBeClickable(src), 20);
		
		if(src.isDisplayed()&&src.isEnabled())
		{
			System.out.println("source element available");
		}
		
		if(dest.isDisplayed()&&dest.isEnabled())
		{
			System.out.println("destination element available");
		}
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0, 1000)");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try{
			Actions a1 = new Actions(driver);		
		 a1.clickAndHold(src).moveToElement(dest).release().build().perform();
		//	a2.perform();
		//	a1.dragAndDrop(src, dest).build().perform();
			System.out.println("element moved successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	/*	Actions a3 = new Actions(driver);
		Action a4 = a3.moveToElement(src).clickAndHold(src).moveToElement(dest).release(dest).build();
		a4.perform();
		
	*/	
	}
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		DragDropCodeOwn d2 = new DragDropCodeOwn();
		d2.dragndrop();
		
	}
	
}
