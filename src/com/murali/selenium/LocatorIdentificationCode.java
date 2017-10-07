package com.murali.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorIdentificationCode {

//	@FindBy(css = "div[id='sb_ifc0']")
//	public WebElement googlesearch;
	
//	@FindBy(css = "div[id='gs_htif0']")
//	public WebElement googlesearch1;
	
//	@FindBy(linkText = "Sign in")
//	public WebElement linktext;
	
	@FindBy(css = "label[id='loginbutton']")
	public WebElement loginButton;
	
	@FindBy(xpath = ".//*[@id='email']")
	public WebElement userName;

	@FindBy(xpath = ".//*[@id='pass']")
	public WebElement password;
	
//	@FindBy(css = "input[value = 'Google Search']")
//	public WebElement googleserachbtn;
	
	public  <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds)
	{
		return new WebDriverWait(driver,timeOutInSeconds, 500).until(expectedCondition);
	}
	
	public void locators()
	{
		
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.fb.com";
		driver.get(url);
		waitFor(driver, ExpectedConditions.elementToBeClickable(loginButton), 10);
	
		if(loginButton.isDisplayed()&&loginButton.isEnabled())
		{
			System.out.println("Element is clickable");
		}

	}
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		LocatorIdentificationCode lc = new LocatorIdentificationCode();
		lc.locators();
	}
}
